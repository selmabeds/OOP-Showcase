//Goal: Implements getFinalPrice to return base price
public class RegularProduct extends Product{
	
	//Constructor (same as parent, because regular)
	public RegularProduct(int productId, String name, double price) {
		super(productId,name,price);
	}
	
	//Return regular price with getFinalPrice
	@Override //Overrides from Product
	public double getFinalPrice() {
		return getPrice();
	}
	
	//toString will not be overriden here because no modifications done.
	
}
