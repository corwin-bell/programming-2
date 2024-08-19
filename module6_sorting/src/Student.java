public class Student {
    int rollno;  
    String name;  
    int age;  
    Student(int rollno, String name, int age) {  
        this.rollno=rollno;  
        this.name=name;  
        this.age=age;  
    }
    
    @Override
    public String toString() {
        return String.format("roll number: %d, name: %s, age: %d", this.rollno, this.name, this.age);
    }
}
