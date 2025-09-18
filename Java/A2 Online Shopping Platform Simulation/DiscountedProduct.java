//Goal: Add discount% and return discounted price
public class DiscountedProduct extends Product {

	//Field(s)
	private double discountPercentage;
	
	//Constructor
	public DiscountedProduct(int productId, String name, double price, double discountPercentage) {
		super(productId,name,price);
		this.discountPercentage = discountPercentage;
		
	}
	
	//Getter to test downcasting in main
	public double getDiscountPercentage() { 
		return discountPercentage;
	}
	
	//Discounted final price
	@Override
	public double getFinalPrice() {
		return getPrice() * (1 - discountPercentage / 100); // price - discount
	}
	
	//Display
	@Override
	public String toString() {
		return super.toString() + " → Final Price: $" + getFinalPrice() + " (" + discountPercentage + "% Discount)";
	}
}
