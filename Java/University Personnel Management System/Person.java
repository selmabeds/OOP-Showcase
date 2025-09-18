/*Personal note: 
* Abstract Class = must be implemented by subclasses = cannot create new Person()
*/
public abstract class Person { 

	//Attributes
	private String name;
	private String id;
	
		
	//Parametized Constructor
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	//Getters - gives access to priv. attributes
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	//Setters - TA told us to get rid of setters for this assignment since we will not use them. 
	
	
	// Abstract method for role description
    public abstract String roleText();

    
    // Properly overridden java's equals method
    @Override //clarifies intent to override java methods to Java's compiler
    public boolean equals(Object obj) {
        if (this == obj) return true; // same exact object
        if (obj == null) return false; // if theres nothing in obj
        if (getClass() != obj.getClass()) return false; // exact class match required

        Person other = (Person) obj;
        return name.equals(other.name) && id.equals(other.id);
    }

    // toString() – base output overriding java's toString
    @Override
    public String toString() {
        return "Person[name=" + name + ", ID=" + id + "]";
    }
}
