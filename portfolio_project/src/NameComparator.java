import java.util.*;
/** user defined Comparator class that compares Student objects based on student name. */  
class NameComparator implements Comparator<Student> {  
    @Override
    public int compare(Student o1, Student o2) {  
        Student s1=(Student)o1;  
        Student s2=(Student)o2;  
        return s1.getName().compareTo(s2.getName());  
    }
    
    public static void main(String[] args) {
        NameComparator nc = new NameComparator();
        try {
            Student s1 = new Student("Vijay","123 Main St", 3.5);  
            Student s2 = new Student("Ajay","456 Center St", 4.0);
            System.out.println("expect compare (Vijay, Ajay) to return positive number: " + nc.compare(s1,s2));
            System.out.println("expect compare (Ajay, Vijay) to return negative number: " + nc.compare(s2,s1));      
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}