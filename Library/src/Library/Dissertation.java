package Library;

public class Dissertation extends Item {

	public String level,authorName,supervisorName,subject;

	public Dissertation(int itemID, int pageNumber, int yearReleased,int itemRemaining,
			String itemTitle, String itemType, String publishedBy,
			String dateBorrowed, boolean eCopy, boolean isAvailable, 
			String level, String authorName, String supervisorName, String subject) {
		super(itemID, pageNumber, yearReleased, itemRemaining, itemTitle, itemType, publishedBy,
				dateBorrowed, eCopy, isAvailable);
		this.level = level;
		this.authorName = authorName;
		this.supervisorName = supervisorName;
		this.subject = subject;
	}
	
}
