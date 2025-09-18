import java.util.ArrayList;
import java.util.List; //For products

public class OnlineShopDemo {

	public static void main(String[] args) {
		// #1 Create list of products (upcasted to Product)
		List<Product> products = new ArrayList<>();
			
		//Add all types of products in list
		products.add(new RegularProduct(0, "Eggs", 4.70));
		products.add(new DiscountedProduct (1, "Blanket", 29.99, 10));
		products.add(new FinalProduct(2, "Chocolate", 2.99, 1.29));
			
		
		// #2 Add multiple user types (upcasted to User)
		List<User> users = new ArrayList<>();
		users.add(new RegularUser(001, "John theRegular"));
		users.add(new PremiumUser(002, "Jane theLoyal"));
		users.add(new AdminUser(003, "Erika theManager"));
		
		
		// #3 Print user receipts (polymorphism)
		for (User u: users) {
			u.printReceipt(products); //Late binding
			System.out.println();
		}
		
		
		// #4 Show downcasting with instanceof, special behavior
		/*Personal note: instanceof tests if an object belongs to a class*/
		System.out.println("Downcasting:");
		for (Product p: products) {
			if (p instanceof DiscountedProduct) {
				//downcasting Product into DiscountedProduct
				DiscountedProduct dp = (DiscountedProduct) p ;
				System.out.println("Product successfully downcasted into Discounted product: " + dp.getName() + ", Discount: " + dp.getDiscountPercentage() + "%");
				
			}
		}
		// #5 Display use final method (AdminUser)
		// Personal Note: Done by looping through all users, checking if they are admin, downcast user to admin if yes. Final method displays stats to prove the user got downcasted to AdminUser. 
		System.out.println("Display use of final method (viewSystemStats()):");
		for (User u: users) {
			if (u instanceof AdminUser) {
				AdminUser admin = (AdminUser) u;
				admin.viewSystemStats(products.size(), users.size());
			}
		}
		
		System.out.println();
		
		
		// #6 Display use of final class (Prove FinalProduct cannot be extended)
		System.out.println("Final class use:");
		for (Product p: products) {
			if (p instanceof FinalProduct) {
				System.out.println(p.getName() + " is a FinalProdct.");
			}
		}
		
		System.out.println();
		
		//#7 Use Late binding to invoke toString() and getFinalPrice() methods
		System.out.println("Late Binding on toString and getFinalPrice:");
		for (Product p: products) {
			System.out.println(p); //invokes toString(), late binding by being overriden during run-time
			System.out.println("Final Price: $" + p.getFinalPrice()); //invokes getFinalPrice
			System.out.println();
			
		}

	}

}
