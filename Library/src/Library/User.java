package Library;

public class User implements Info {

	public int userID,itemstoReturn,fineAmount;
	public String userName, address;
	
	public User(int userID, int itemstoReturn, int fineAmount, String userName,
			String address) {
		super();
		this.userID = userID;
		this.itemstoReturn = itemstoReturn;
		this.fineAmount = fineAmount;
		this.userName = userName;
		this.address = address;
	}
	
	public String getuserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}