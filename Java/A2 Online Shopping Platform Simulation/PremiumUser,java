//Goal: Adds loyalty point system + custom receipt print

import java.util.List;

public class PremiumUser extends User {

	//Constructor
	public PremiumUser(int userId, String username) {
		super(userId, username);
	}
	
	//Print Receipt
	@Override
	public void printReceipt(List<Product> productList) {
		//Variable(s)
		double total = 0;
		int newPoints = 0;
		
		//Receipt Header
		System.out.println("--- Receipt for PremiumUser: " + getUsername() + " ---");
				
		//Show each product (Loop through list)
		for (Product p: productList) {
			System.out.println(p); //Uses corresponding overriden toString
			total += p.getFinalPrice();
		}
		
		//Print total
		System.out.printf("Total: $%.2f\n", total);
		
		
		//Loyalty Points Extra
		newPoints = (int) (total * 0.1);
		System.out.println("Points Earned: " + newPoints);
	 }
		

		
}
