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
        Student s1 = new Student(101,"Vijay","123 Main St");  
        Student s2 = new Student(106,"Ajay","456 Center St");
        NameComparator nc = new NameComparator();
        System.out.println(nc.compare(s2,s1));
    }
}