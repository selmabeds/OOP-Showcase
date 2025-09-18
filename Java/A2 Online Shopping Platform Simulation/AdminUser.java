//Goal: Final metho to viewSystemStats()

import java.util.List;
public class AdminUser extends User{

	//Constructor
	public AdminUser(int userId, String username) {
		super(userId, username);
	}
	
	//Print Receipt Admin
	public void printReceipt(List<Product> productList) {
		//Variable
		double total = 0;
		
		//Header
		System.out.println("--- Receipt for AdminUser: " + getUsername() + " ---");
		
		//Display User Id (admin tracking)
		System.out.println("User ID: " + getUserId());
		
		//Loop through products
		for (Product p: productList) {
			System.out.println(p);
			total += p.getFinalPrice();
		}
		
		//Print total
		System.out.printf("Total: $%.2f\n", total);
		}
	
	//System statistics
	/* Personal Note: Final method = cannot be overriden by subclasses*/
	public final void viewSystemStats(int totalProducts, int totalUsers) {
		System.out.println("Admin Stats: Total Products: " + totalProducts + " | Total Users: " + totalUsers);
	}
		
}
