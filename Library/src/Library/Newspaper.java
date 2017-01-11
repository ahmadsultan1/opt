package Library;

public class Newspaper extends Item {

	public String dateofPublish;

	public Newspaper(int itemID, int pageNumber, int yearReleased, int itemRemaining,
			String itemTitle, String itemType, String publishedBy,
			String dateBorrowed, boolean eCopy, boolean isAvailable, String dateofPublish) {
		super(itemID, pageNumber, yearReleased, itemRemaining, itemTitle, itemType, publishedBy,
				dateBorrowed, eCopy, isAvailable);
		this.dateofPublish = dateofPublish;
	}
	
}
