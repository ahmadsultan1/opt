package Library;

public class Book extends Item {

	public String genreName, authors;

	public Book(int itemID, int pageNumber, int yearReleased, int itemRemaining, String itemTitle,
			String itemType, String publishedBy, String dateBorrowed,
			boolean eCopy, boolean isAvailable, String genreName,String authors) {
		super(itemID, pageNumber, yearReleased, itemRemaining,itemTitle, itemType, publishedBy,
				dateBorrowed, eCopy, isAvailable);
		this.genreName = genreName;
				this.authors = authors;
	}
	
	
}
