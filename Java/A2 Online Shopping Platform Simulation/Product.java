
public abstract class Product {
//Abstract forces all subclasses to define final price
	
	//Fields
	private int productId; //Search,track...
	private String name;
	private double price;
	static int c = 0; //Ensures all products arent c=1
	
	//Parametized Constructor, initializes all fields
	public Product(int productId, String name, double price) {
		this.productId=productId;
		this.name=name;
		this.price=price;
		c+=1;
		
	}
	
	
	
	//Getters
	public int getProductId() { //Not used, but ensures reusable code if we want to search a Product.
		return productId;
	}
	
	public String getName() { //Use when display in receipt
		return name;
	}
	
	public double getPrice() { //Use in subclasses when modifying price
		return price;
	}
	
	
	
	//Abstract method: subclasses determine how to calculate final price
	public abstract double getFinalPrice();
	
	//Product info (override Java)
	@Override
	public String toString() {
		return "Product: " + name + " - $" + price;
	}
}
