import java.util.*;  
class NameComparator implements Comparator<Student> {  
    public int compare(Student o1, Student o2) {  
        Student s1=(Student)o1;  
        Student s2=(Student)o2;  
        return s1.name.compareTo(s2.name);  
    }
    
    public static void main(String[] args) {
        Student s1 = new Student(101,"Vijay",23);  
        Student s2 = new Student(106,"Vijay",27);
        NameComparator nc = new NameComparator();
        System.out.println(nc.compare(s2,s1));
    }
}