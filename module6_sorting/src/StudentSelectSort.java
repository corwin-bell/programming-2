/*
 * Create a Java program that will store 10 student objects in an ArrayList, ArrayList<Student>. 
 * A student object consists of the following fields:
 * int rollno
 * String name
 * String address
 * Implement two comparator classes to sort student objects by name and by rollno (roll number).
 * Implement your own selection sort method and place your code in a separate Java source file. 
 * Do not use a sort method from the Java collections library.
 */

import java.util.ArrayList;
import java.util.Comparator;

public class StudentSelectSort {
   public static void selectionSort(ArrayList<Student> studentList, Comparator<Student> comparator) {
      int i;
      int j;
      int indexSmallest;
      Student temp;      // Temporary variable for swap
 
      for (i = 0; i < studentList.size() - 1; ++i) {
 
         // Find index of smallest remaining element
         indexSmallest = i;
         for (j = i + 1; j < studentList.size(); ++j) {

            if (comparator.compare(studentList.get(j), studentList.get(indexSmallest)) < 0) {
               indexSmallest = j;
            }
         }

         // Swap numbers[i] and numbers[indexSmallest]
         temp = studentList.get(i);
         studentList.set(i, studentList.get(indexSmallest));
         studentList.set(indexSmallest, temp);
      }
   }
 
   public static void main(String [] args) {
      // todo: refactor to take student arraylist
      ArrayList<Student> al = new ArrayList<Student>();  
      al.add(new Student(105,"Vijay",23));  
      al.add(new Student(106,"Ajay",27));  
      al.add(new Student(101,"Jai",21));  
      
      System.out.println("unsorted");
      for (int i = 0; i < al.size(); i++) {
         System.out.println(al.get(i));  
      }

      selectionSort(al, new NameComparator());
      System.out.println("sorted by name");  
      for (int i = 0; i < al.size(); i++) {
         System.out.println(al.get(i));  
      }

      selectionSort(al, new RollNoComparator());
      System.out.println("sorted by roll number");  
      for (int i = 0; i < al.size(); i++) {
         System.out.println(al.get(i));  
      }
   }
}