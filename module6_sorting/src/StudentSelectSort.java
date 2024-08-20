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
import java.util.Arrays;
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
      ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(
         new Student(105,"John","123 Main St"),
         new Student(106,"Frank","123 Main St"),
         new Student(107,"Anne","123 Main St"),
         new Student(108,"Zack","123 Main St"),
         new Student(109,"George","123 Main St"),
         new Student(110,"Lawrence","123 Main St"),
         new Student(101,"Peter","123 Main St"),
         new Student(102,"Zoe","123 Main St"),
         new Student(103,"Barbara","123 Main St"),
         new Student(104,"Mary","123 Main St")
         )
      );
      
      System.out.println("\nunsorted");
      for (int i = 0; i < studentList.size(); i++) {
         System.out.println(studentList.get(i));  
      }

      selectionSort(studentList, new NameComparator());
      System.out.println("\nsorted by name");  
      for (int i = 0; i < studentList.size(); i++) {
         System.out.println(studentList.get(i));  
      }

      selectionSort(studentList, new RollNoComparator());
      System.out.println("\nsorted by roll number");  
      for (int i = 0; i < studentList.size(); i++) {
         System.out.println(studentList.get(i));  
      }
   }
}