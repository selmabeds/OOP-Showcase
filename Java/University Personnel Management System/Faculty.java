
public class Faculty extends Person {

	//Attributes
	private String department;
	private String rank;
	
	//Default constructor
	public Faculty() {
		super();
		department = "Unknown";
		rank = "Unknown";
	}
	
	//Parametized Constructor
	public Faculty(String name, String id, String department, String rank) {
		super(name,id);
		this.department = department;
		this.rank = rank;
	}
	
	//Getters
	public String getDepartment() {
		return department;
	}
	
	public String getRank() {
		return rank;
	}
	
	//Setters - Omitted for TAs preferences
	
	// Role description ; Faculty-specific
    @Override
    public String roleText() {
        return "Professor in " + department;
    }

    // toString Override
    @Override
    public String toString() {
        return super.toString() + ", Department=" + department + ", Rank=" + rank;
    }

    // Equals Override
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Faculty other = (Faculty) obj;
        return super.equals(other) &&
               department.equals(other.department) &&
               rank.equals(other.rank);
    }
}
