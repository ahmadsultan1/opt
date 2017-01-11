package Library;

public abstract class Item implements Info {

	public int itemID,pageNumber,yearReleased, itemRemaining;
	public String itemTitle, itemType, publishedBy, dateBorrowed;
	public boolean eCopy, isAvailable;
	
	public Item(int itemID, int pageNumber, int yearReleased, int itemRemaining, String itemTitle,
			String itemType, String publishedBy, String dateBorrowed,
			boolean eCopy, boolean isAvailable) {
		super();
		this.itemID = itemID;
		this.pageNumber = pageNumber;
		this.yearReleased = yearReleased;
		this.itemRemaining = itemRemaining;
		this.itemTitle = itemTitle;
		this.itemType = itemType;
		this.publishedBy = publishedBy;
		this.dateBorrowed = dateBorrowed;
		this.eCopy = eCopy;
		this.isAvailable = isAvailable;
	}


	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}
	public String getItemTitle() {
		return itemTitle;
	}


	public int getItemRemaining() {
		return itemRemaining;
	}


	public void setItemRemaining(int itemRemaining) {
		this.itemRemaining = itemRemaining;
	}
		
}
