package Library;

import static org.junit.Assert.*;

import org.junit.Test;

public class libraryTest {

	@Test
	public void additemtest() {
		Library lib = new Library();
		Book hp = new Book(1, 312, 2016, 3, "Harry Potter and chamber of secrets",
				"Book", "Penguin Books", "26-11-2016", true, true, "Adventure", "JK Rowling");
		lib.addItem(hp);
		Book hp1 = (Book) lib.items.get(0);
		assertEquals(hp1,hp);
	}
	@Test
	public void addusertest() {
		Library lib = new Library();
		User alen = new User(1, 2, 0, "alen92", "32 Salford Lane, Manchester, M50 4HJ");
		lib.registerUser(alen);
		User alen1 = (User) lib.user.get(0);
		assertEquals(alen1,alen);
	}
	
	@Test
	public void testlibrary() {
		Library lib = new Library();
		assertNotNull(lib);
	}
	
	
	@Test
	public void testremoveItem() {
		Library lib = new Library();
		Book hp = new Book(1, 312, 2016, 3, "Harry Potter and chamber of secrets",
				"Book", "Penguin Books", "26-11-2016", true, true, "Adventure", "JK Rowling");
		lib.addItem(hp);
		lib.removeItem(hp);
		//Book hp1 = (Book) lib.items.get(0);
		assertEquals(0,lib.items.size());
	}
	
	@Test
	public void testdeleteUser() {
		Library lib = new Library();
		User alen = new User(1, 2, 0, "alen92", "32 Salford Lane, Manchester, M50 4HJ");
		lib.registerUser(alen);
		lib.deleteUser(alen);
		//User alen1 = (User) lib.user.get(0);
		assertEquals(0,lib.user.size());
	}
	
	@Test
	public void testupdateitem() {
		Library lib = new Library();
		Book hp = new Book(1, 312, 2016, 3, "Harry Potter and chamber of secrets",
				"Book", "Penguin Books", "26-11-2016", true, true, "Adventure", "JK Rowling");
		lib.addItem(hp);
		lib.updateItem(1, "Harry Potter and the goblet of fire");
		assertEquals("Harry Potter and the goblet of fire", lib.items.get(0).itemTitle);
	}
	
	@Test
	public void testupdateUser() {
		Library lib = new Library();
		User alen = new User(1, 2, 0, "alen92", "32 Salford Lane, Manchester, M50 4HJ");
		lib.registerUser(alen);
		lib.updateUser(1, "alen1992");
		assertEquals("alen1992", lib.user.get(0).userName);
	}
	
	@Test
	public void testcheckoutItem() {
		Library lib = new Library();
		Book hp = new Book(1, 312, 2016, 3, "Harry Potter and chamber of secrets",
				"Book", "Penguin Books", "26-11-2016", true, true, "Adventure", "JK Rowling");
		lib.addItem(hp);
		lib.checkoutItem(1);
		assertNotSame(2,lib.items.get(0).itemRemaining);
	}
	
	@Test
	public void testcheckinItem() {
		Library lib = new Library();
		Book hp = new Book(1, 312, 2016, 3, "Harry Potter and chamber of secrets",
				"Book", "Penguin Books", "26-11-2016", true, true, "Adventure", "JK Rowling");
		lib.addItem(hp);
		lib.checkoutItem(1);
		assertNotSame(4,lib.items.get(0).itemRemaining);
	}

}
