//Receipt printing method is used with List: 
import java.util.List; //Can .add(), remove, size, etc. + Loop through all products

//Abstract forces all subclassess to define how to print
public abstract class User {

	
	//Fields
	private int userId;
	private String username;
	
	//Constructor (initialize all fields)
	public User(int userId, String username) {
		this.userId=userId;
		this.username=username;
	}
	
	//Getters
	public int getUserId() { //Admin receipt printing
		return userId;
	}
	
	public String getUsername() {
		return username; //For receipt printing in subclasses
	}
	
	
	//Abstract Receipt Printing Format
	/*Personal note: List containing Product objects*/
	public abstract void printReceipt(List<Product> productList);
	
	
	//User printing (not for receipt, useful for debugging or simple display)
	@Override
	public String toString() {
		return username;
	}
	
}
