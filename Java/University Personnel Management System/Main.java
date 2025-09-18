
public class Main {

	public static void main(String[] args) {
		
		
		// Students' comparison
        Person student1 = new Student("Alice", "S123", 3.8, "Computer Science");
        Person student2 = new Student("Bob", "S124", 3.8, "Computer Science");
        printComparison("Student", student1, student2, "Are Alice and Bob equal?");

        // Faculty comparison
        Person faculty1 = new Faculty("Dr. Smith", "F001", "Physics", "Professor");
        Person faculty2 = new Faculty("Dr. Smith", "F001", "Physics", "Professor");
        printComparison("Faculty`", faculty1, faculty2, "Are both faculty members equal?");

        // Staff comparison
        Person staff1 = new Staff("Clara", "T501", "Registrar", true);
        Person staff2 = new Staff("Clara", "T502", "Registrar", false);
        printComparison("Staff", staff1, staff2, "Are the two staff members equal?");
    }

	
//Methods (Helps synthesize Main Driver)
    
	//Stringbuilder to give the reason (same class).
	//Personal note: Stringbuilder = java built-in Object, helps temporary mods to String
    public static String explainDiff(Person p1, Person p2) {
       
    	//Stop comparison if different classes
    	if (!p1.getClass().equals(p2.getClass()))
            return "Different classes";

        StringBuilder reasons = new StringBuilder();

        //Compare Students
        if (p1.getClass() == Student.class) {
            Student s1 = (Student) p1;
            Student s2 = (Student) p2;

            if (!s1.getId().equals(s2.getId()))
                reasons.append("Different IDs"); //calling append concatenates without creating more string objects
            if (s1.getGPA() != s2.getGPA())
                appendWithAnd(reasons, "Different GPAs");
            if (!s1.getMajor().equals(s2.getMajor()))
                appendWithAnd(reasons, "Different majors");
        }

        
        //Compare Faculty
        if (p1.getClass() == Faculty.class) {
            Faculty f1 = (Faculty) p1;
            Faculty f2 = (Faculty) p2;

            if (!f1.getId().equals(f2.getId()))
                reasons.append("Different IDs");
            if (!f1.getDepartment().equals(f2.getDepartment()))
                appendWithAnd(reasons, "Different departments");
            if (!f1.getRank().equals(f2.getRank()))
                appendWithAnd(reasons, "Different ranks");
        }

        
        //Compare Staff
        if (p1.getClass() == Staff.class) {
            Staff t1 = (Staff) p1;
            Staff t2 = (Staff) p2;

            if (!t1.getId().equals(t2.getId()))
                reasons.append("Different IDs");
            if (!t1.getRole().equals(t2.getRole()))
                appendWithAnd(reasons, "Different roles");
            if (t1.getStatus() != t2.getStatus())
                appendWithAnd(reasons, "Different full-time/part-time status");
        }

        if (reasons.length() == 0)
            return "All fields match";
        else
            return reasons.toString();
    }

    //Helper to cleanly add "and" between reasons
    public static void appendWithAnd(StringBuilder sb, String reason) {
        if (sb.length() > 0) {
            sb.append(" and ");
        }
        sb.append(reason);
    }
    
	//Print the whole comparison result
    public static void printComparison(String label, Person p1, Person p2, String comparisonText) {
        System.out.println(label + ": " + p1.toString());
        System.out.println(); 
        
        System.out.println("Role: " + p1.roleText());
        System.out.println(); 
        
        System.out.println(label + ": " + p2.toString());
        System.out.println(); 
        
        System.out.println("Role: " + p2.roleText());
        System.out.println(); 
        
        boolean equal = p1.equals(p2);
        String reason = explainDiff(p1, p2);
        
        if (equal) {
            System.out.println(comparisonText + " true");
        } else {
            System.out.println(comparisonText + " false (" + reason + ")");
        }
        
        System.out.println("\n"); // two blank lines between sections
    }


}
