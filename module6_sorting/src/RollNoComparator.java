import java.util.*;
/** user defined Comparator class that compares two student objects based on roll number. */  
class RollNoComparator implements Comparator<Student> {  
    @Override
    public int compare(Student o1, Student o2) {  
        Student s1=(Student)o1;  
        Student s2=(Student)o2;  
        return s1.getRollno() - s2.getRollno();  
    }
    
    public static void main(String[] args) {
        Student s1 = new Student(101,"Vijay","123 Main St");  
        Student s2 = new Student(106,"Vijay","456 Center St");
        RollNoComparator nc = new RollNoComparator();
        System.out.println(nc.compare(s2,s1));
    }
}