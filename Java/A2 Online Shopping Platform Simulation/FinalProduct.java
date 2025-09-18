//Goal: Offers flat promotional price.
//Final Class: Locks the class' behaviour, cannot be modified in subs.

public final class FinalProduct extends Product {

	//Fields
	private double promoPrice;
	
	//Constructor (with promo price)
	public FinalProduct(int productId, String name, double price, double promoPrice) {
		super(productId,name,price);
		this.promoPrice = promoPrice;
	}
	
	//Return promotional price as final price value
	@Override
	public double getFinalPrice() {
		return promoPrice;
	}
	
	//Output with promo price
	@Override
	public String toString(){
		return super.toString() + " → Final Price: $" + promoPrice + " (Promo.)";
	}
}
