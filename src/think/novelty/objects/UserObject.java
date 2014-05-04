package think.novelty.objects;

public class UserObject {
	private String mFirstName;
	private String mLastName;
	
	public UserObject() {
		init("", "");
	}
	
	public UserObject(String firstName, String lastName) {
		init(firstName, lastName);
	}
	
	public void init(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public void setFirstName(String firstName) {
		mFirstName = firstName;
	}
	
	public void setLastName(String lastName) {
		mLastName = lastName;
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
