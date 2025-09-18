
public class Staff extends Person {

	//Attributes
	private String role;
	private boolean status;
	
	//Default Constructor
	public Staff() {
		super();
		role = "Unknown";
		status = false;
	}
	
	//Constructor
	public Staff(String name, String id, String role, boolean status) {
		super(name, id);
		this.role = role;
		this.status = status;
	}
	
	//Getters
	public String getRole() {
		return role;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	//Setters - Omitted for TAs preferences
	
	  // Role description ; Staff-specific
    @Override
    public String roleText() {
        return (status ? "Full-time " : "Part-time ") + role;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", Role=" + role + ", Full-Time=" + status;
    }

    // Proper equals override
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Staff other = (Staff) obj;
        return super.equals(other) &&
               status == other.status &&
               role.equals(other.role);
    }
}