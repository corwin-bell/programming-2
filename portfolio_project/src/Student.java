/**
 * The Student class provides basic fields for storing student information such as GPA, name, and address.
 * The Student class also includes  a parameterized constructor and methods for setting and getting student information.
 */
public class Student {
    private String name;  
    private String address;  
    private double gpa;  
    /**
     * Default Student class constructor.
     */
    Student() {
        this.name = "";
        this.address = "";
        this.gpa = 0;
    }

    /**
     * Parameterized constructor for Student class.
     * @param name student name.
     * @param address student home address.
     * @param gpa student grade point average.
     */
    Student(String name, String address, double gpa) throws Exception{  
        if (gpa < 0) {
            throw new Exception("gpa must be a positive double");
        }
        else {
            this.name = name;  
            this.address = address;
            this.gpa = gpa;      
        }
    }
    
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setAddress(String address) { this.address = address; }
    public String getAddress() { return address; }
    public void setGpa(double gpa) throws Exception{ 
        if (gpa < 0) {
            throw new Exception("gpa must be a positive double");
        }
        else {
            this.gpa = gpa; 
        }
    }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return String.format("name: %s, address: %s, GPA: %.2f", getName(), getAddress(), getGpa());
    }
    public static void main(String[] args) {
        
        // test parameterized constructor, getters, and toString
        try {
            Student student = new Student("Testy Testerman", "123 Test St", 3.5);
            System.out.println("student parameterized constructor test: " + student.toString());    
        } 
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        // test default constructor
        Student student2 = new Student();
        System.out.println("student2 default constructor test: " + student2.toString());

        // test setters
        try {
            student2.setGpa(3.75);    
        } 
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        student2.setName("Test Testerman Jr.");
        student2.setAddress("456 Test Ave");
        System.out.println("student2 setters test: " + student2.toString());
    }
}
