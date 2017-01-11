package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	
	ArrayList<Item> items = new ArrayList<>();
	ArrayList<User> user = new ArrayList<>();
	
	 Scanner scan = new Scanner(System.in);
	
	protected void showUser() {
		if (user.size() == 0) {
			System.out.println("No users yet.");
		} else {
		for (User a : user) {
			System.out.println(a.getuserName());
		}
		}
		
	}
	
	public void showItem() {
		if (items.size() == 0) {
			System.out.println("No items yet.");
		} else {
		for (Item b : items) {
			System.out.println(b.getItemTitle());
		}
		}
	}
		
	public void addItem(Item i) {
		items.add(i);
		System.out.println(i.itemTitle + " added.");
	}
	
	protected void registerUser(User u) {
		user.add(u);
		System.out.println(u.userName + " registered.");
	}
	
	public void removeItem(Item remItem) {
		for (Item j : items) {
			if (j.equals(remItem)) {
				items.remove(remItem);
				System.out.println(j.getItemTitle() + " Removed.");
			}
			break;
		}
	}
	
	public void deleteUser(User delUser) {
		for (User k : user) {
			if (k.equals(delUser)) {
				user.remove(delUser);
				System.out.println(k.getuserName() + " Removed.");
			}
			break;
		}
	}
	
	public void updateItem(int itemID, String itemTitle) {
		for (Item l : items) {
		if (l.itemID==itemID) {
			l.setItemTitle(itemTitle);
			System.out.println("Itemname updated.");
		}
		} 
	}
	public void updateUser(int userID, String userName) {
		for (User n : user) {
		if (n.userID == userID) {
			n.setUserName(userName);
			System.out.println("Username updated.");
		}
		}
	}
	
	public void checkoutItem(int itemID) {
		 for (Item m : items) {
			if (m.itemID == itemID) {
				int currentremaining = m.getItemRemaining();
				currentremaining -= 1;
				m.setItemRemaining(currentremaining);
				System.out.println(m.itemTitle + " checkedout and " + m.getItemRemaining() + " left");
			}
			} 
	}
	
	public void checkinItem(int itemID) {
		for (Item o : items) {
			if (o.itemID == itemID) { 
				int currentremaining = o.getItemRemaining();
				currentremaining += 1;
				o.setItemRemaining(currentremaining);
				System.out.println(o.itemTitle + " checked in and " + o.getItemRemaining() + " left");
			}
			} 
	}
	
	public void addUser() {
		boolean q = true;
		while (q == true){
			System.out.println("Enter username.");
			String name = scan.nextLine();
						
			System.out.println("Enter address.");
			String address = scan.nextLine();
			
			System.out.println("Enter User ID.");
			int id = scan.nextInt();
			System.out.println("Enter items to return");
			int items = scan.nextInt();
			System.out.println("Enter fine amount.");
			int fine = scan.nextInt();
			scan.nextLine();			
			User z = new User(id,items,fine, name, address);
			registerUser(z);
			q=false;
		}
		
		
	}
	
	public void addBook() {
		boolean qu = true;
		while (qu == true){
			
			System.out.println("Enter Item ID:");
			int I_ID = scan.nextInt();				
			System.out.println("Enter page number:");
			int p_no = scan.nextInt();			
			System.out.println("Enter year of the release:");
			int year = scan.nextInt();
			System.out.println("Enter item remaining:");
			int i_remain = scan.nextInt();			
			System.out.println("Enter the title of the item:");
			String iTitle = scan.next();			
			System.out.println("Enter the type of the item:");
			String itype = scan.next();			
			System.out.println("Enter the publisher name of the item:");
			String ipub = scan.next();
			System.out.println("Enter the item borrow date:");
			String iborrow = scan.next();			
			System.out.println("Is there an electronic copy:");
			Boolean iecopy = scan.nextBoolean();			
			System.out.println("Is the item available:");
			Boolean iavailable = scan.nextBoolean();			
			System.out.println("Enter the genre of the item:");
			String igenre = scan.next();			
			System.out.println("Enter the author name of the item:");
			String iauthor = scan.next();
			
			Item it = new Book(I_ID, p_no, year, i_remain, iTitle, itype, ipub, 
					iborrow, iecopy, iavailable, igenre, iauthor);
			
			addItem(it);
			qu=false;
		}
		
		
	}

	
}
