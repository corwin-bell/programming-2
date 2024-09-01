/**
 * The Student class provides basic fields for storing student information such as GPA, name, and address.
 * The Student class also includes  a parameterized constructor and methods for setting and getting student information.
 */
public class Student {
    private double gpa;  
    private String name;  
    private String address;  
    
    /**
     * Default Student class constructor.
     */
    Student() {
        this.gpa = 0;
        this.name = "";
        this.address = "";
    }

    /**
     * Parameterized constructor for Student class.
     * @param gpa student grade point average.
     * @param name student name.
     * @param address student home address.
     */
    Student(double gpa, String name, String address) {  
        this.gpa = gpa;  
        this.name = name;  
        this.address = address;  
    }
    
    public void setGpa(double gpa) { this.gpa = gpa; }
    public double getGpa() { return gpa; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setAddress(String address) { this.address = address; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return String.format("GPA: %.2f, name: %s, address: %s", getGpa(), getName(), getAddress());
    }
    public static void main(String[] args) {
        // test parameterized constructor, getters, and toString
        Student student = new Student(3.5, "Testy Testerman", "123 Test St");
        System.out.println("student parameterized constructor test: " + student.toString());
        
        // test default constructor
        Student student2 = new Student();
        System.out.println("student2 default constructor test: " + student2.toString());

        // test setters
        student2.setGpa(3.75);
        student2.setName("Test Testerman Jr.");
        student2.setAddress("456 Test Ave");
        System.out.println("student2 setters test: " + student2.toString());

    }
}
