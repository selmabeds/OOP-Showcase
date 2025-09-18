
public class Student extends Person {

	//Attributes
	private double gpa;
	private String major;
	
	//Default Constructor
	public Student() {
		super();
		gpa = 0.0;
		major = "Unknown";
	}
	
	//Parametized Constructor
	public Student(String name, String id, double gpa, String major) {
		super(name, id); // calls Person's constructor
		this.gpa = gpa;
		this.major = major;
	}
	
	//Getters
	public double getGPA() {
		return gpa;
	}
	
	public String getMajor() {
		return major;
	}
	
	//Setters - omitted for TA's preferences
	
    // Role description ; Student-specific
    @Override //override Person
    public String roleText() {
        return "Undergraduate student in " + major;
    }

    // toString overriding Person
    @Override
    public String toString() {
        return super.toString() + ", GPA=" + gpa + ", Major=" + major;
    }

    // Proper equals overriding Person
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Student other = (Student) obj;
        return super.equals(other) && //calls Person's code
               gpa == other.gpa &&
               major.equals(other.major);
    }
}