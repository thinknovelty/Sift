package think.novelty.objects;

public class SiftObject {
	private String mName;
	private String mDescription;
	private double mPrice;

	public SiftObject() {
		init("", "", 0.00);
	}
	
	public SiftObject(String name, String description, double price) {
		init(name, description, price);
	}
	
	private void init(String name, String description, double price) {
		setName(name);
		setDescription(description);
		setPrice(price);
	}
	
	public void setName(String name) {
		mName = name;
	}
	
	public void setDescription(String description) {
		mDescription = description;
	}
	
	public void setPrice(double price) {
		mPrice = price;
	}
	
	public String getName() {
		return mName;
	}
	
	public String getDescription() {
		return mDescription;
	}
	
	public double getPrice() {
		return mPrice;
	}
	
	public String getPriceString() {
		return "$".concat(Double.toString(mPrice));
	}
}
