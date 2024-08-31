/**
 * The Student class provides basic fields for storing student information such as roll number, name, and address.
 * The Student class also includes  a parameterized constructor and methods for setting and getting student information.
 */
public class Student {
    private int rollno;  
    private String name;  
    private String address;  
    
    /**
     * Parameterized constructor for Student class.
     * @param rollno student roll number.
     * @param name student name.
     * @param address student home address.
     */
    Student(int rollno, String name, String address) {  
        this.rollno = rollno;  
        this.name = name;  
        this.address = address;  
    }
    
    public void setRollno(int rollno) { this.rollno = rollno; }
    public int getRollno() { return rollno; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setAddress(String address) { this.address = address; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return String.format("roll number: %d, name: %s, address: %s", this.rollno, this.name, this.address);
    }
}
