public class Student {
    private int rollno;  
    private String name;  
    private int age;  
    Student(int rollno, String name, int age) {  
        this.rollno=rollno;  
        this.name=name;  
        this.age=age;  
    }
    public void setRollno(int rollno) { this.rollno = rollno; }
    public int getRollno() { return rollno; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    
    @Override
    public String toString() {
        return String.format("roll number: %d, name: %s, age: %d", this.rollno, this.name, this.age);
    }
}
