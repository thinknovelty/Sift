package think.novelty.sift;

public class UserInfo {
	private String mFirstName;
	private String mLastName;
	
	public UserInfo() {
		mFirstName = "";
		mLastName = "";
	}
	
	public void setFirstName(String firstName) {
		mFirstName = firstName;
	}
	
	public void setLastName(String lastName) {
		mLastName = lastName;
	}
	
	public void setName(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public String getFirstName() {
		return mFirstName;
	}
	
	public String getLastName() {
		return mLastName;
	}
	
	public String getName() {
		return getFirstName() + " " + getLastName();
	}
}
