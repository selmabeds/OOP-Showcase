//Goal: printReceipt() showing total and product list
import java.util.List;

public class RegularUser extends User{
	
	//Constructor (idem User because User is abstract)
	public RegularUser(int userId, String username) {
		super(userId, username);
	}
	
	//Print receipt
	@Override
	public void printReceipt(List<Product> productList) {
		//Field(s)
		double total = 0;
		
		//Receipt Header
		System.out.println("--- Receipt for RegularUser: " + getUsername() + " ---");
		
		//Show each product (Loop through list)
		/*Personal note: p is a shortcut name given to each product in list*/
		for (Product p: productList) {
			System.out.println(p); //Uses corresponding overriden toString
			total += p.getFinalPrice();
		}
		
		//Print total
		System.out.printf("Total: $%.2f\n", total);
	}
	
}
