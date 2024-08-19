import java.util.*;  
class RollNoComparator implements Comparator<Student> {  
    @Override
    public int compare(Student o1, Student o2) {  
        Student s1=(Student)o1;  
        Student s2=(Student)o2;  
        return s1.getRollno() - s2.getRollno();  
    }
    
    public static void main(String[] args) {
        Student s1 = new Student(101,"Vijay",23);  
        Student s2 = new Student(106,"Vijay",27);
        RollNoComparator nc = new RollNoComparator();
        System.out.println(nc.compare(s2,s1));
    }
}