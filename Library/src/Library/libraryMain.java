package Library;
import java.util.Scanner;

public class libraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner scan = new Scanner(System.in);
		
	/*	User alen = new User(1, 2, 0, "alen92", "32 Salford Lane, Manchester, M50 4HJ");
		
		User ben = new User(2, 1, 65, "ben93", "873 Anchorage Lane, Salford, M65 8HJ");
		
		Book hp = new Book(1, 312, 2016, 3, "Harry Potter and chamber of secrets",
				"Book", "Penguin Books", "26-11-2016", true, true, "Adventure", "JK Rowling");
		
		Newspaper sun = new Newspaper(2, 33, 2016, 1, "The Sun", "Newspaper", "The sun",
				null, false, true, "26/12");
		
		Dissertation bitcoin = new Dissertation(3, 62, 2014, 1, "Development of Bitcoin", 
				"Dissertation", "Lancaster University", "09-09-2016", true, 
				true, "MSc", "David Jacob", "Bingsheng Zhang", "Bitcoin");*/
		
		Library lib = new Library();
		
		boolean quit = false;
		 while (!quit) {
		 System.out.println("Press 1 to show all the users.");
		 System.out.println("Press 2 to show all the items.");
		 System.out.println("Press 3 to create a user.");
		 System.out.println("Press 4 to add a book.");
		 System.out.println("Press 11 quit.");
		  int input = scan.nextInt();
		  
		switch (input) {
		case 1 : lib.showUser();
		break;
		case 2 : lib.showItem();
		break;
		case 3 : lib.addUser();
		break;
		case 4 : lib.addBook();
		break;
		/*
		case 5 : lib.removeItem();
		break;
		case 6 : lib.deleteUser();
		break;
		case 7 : lib.updateItem();
		break;
		case 8 : lib.updateUser();
		break;
		case 9 : lib.checkoutItem();
		break;
		case 0 : lib.checkinItem();
		break;
		*/
		default:
			quit = true;
			System.out.println("Thank you for using the service. Bye.");
		}
		}
		
		/*
		lib.registerUser(alen);
		lib.registerUser(ben);
		System.out.println();
		lib.addItem(hp);
		lib.addItem(sun);
		lib.addItem(bitcoin);
		System.out.println();
		System.out.println("All the users");
		System.out.println();
		lib.showUser();
		System.out.println();
		System.out.println("All the items");
		System.out.println();
		lib.showItem();
		System.out.println();
		
		
		lib.checkoutItem(3);
		lib.checkinItem(1);
		
		
		lib.updateUser(1,"alen1993");
		lib.showUser();
		System.out.println();
		lib.updateItem(1,"Harry Potter and the goblet of fire");
		lib.showItem();
		
		lib.removeItem(hp);
		System.out.println("All the items left");
		lib.showItem();
		System.out.println();
		lib.deleteUser(alen);
		System.out.println("All the users left");
		lib.showUser();
		*/
		}

}
