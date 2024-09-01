import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.lang.IndexOutOfBoundsException;

public class Student_List {
    public static void main(String[] args) throws Exception {
        LinkedList<Student> studentList = new LinkedList<>();
        String command = "";
        try (Scanner scnr = new Scanner(System.in)) {
            do {
                System.out.println("Commands: 'addStudent', 'listStudents', 'removeStudent', 'updateStudent','exportStudentList', 'quit'");
                command = scnr.nextLine();
                if (command.equalsIgnoreCase("addStudent")) {
                    addStudent(studentList, scnr);
                }
                else if (command.equalsIgnoreCase("listStudents")) {
                    listStudents(studentList);
                }
                else if (command.equalsIgnoreCase("removeStudent")) {
                    removeStudent(studentList, scnr);
                }
                else if (command.equalsIgnoreCase("updateStudent")) {
                    updateStudent(studentList, scnr);
                }
                else if (command.equalsIgnoreCase("exportStudentList")) {
                    exportStudentList(studentList, scnr);
                }
                scnr.nextLine(); // clears scanner before next userInput
            }
            while (!command.equalsIgnoreCase("quit"));   
        }       
    }
    
    public static void addStudent(LinkedList<Student> studentList, Scanner scnr) {
        // add new student to studentList inventory
        try {
            System.out.println("Enter student GPA: ");
            double gpa = scnr.nextDouble();
            scnr.nextLine();
            System.out.println("Enter student name: ");
            String name = scnr.nextLine();
            System.out.println("Enter student address: ");
            String address = scnr.nextLine();
            Student student = new Student(gpa, name, address);
            studentList.add(student);
            System.out.println("student added");
            // TODO: why does it not go back to main while loop options?
        }
        catch (InputMismatchException e) {
            System.err.println("must enter correct data type for each field");
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static void listStudents(LinkedList<Student> studentList) {
        // print all autos in inventory to a new line
        if (studentList.isEmpty()) {
            System.out.println("Student list is empty, add a student in order to list.");
        }
        else {
            // TODO: check if getNext faster than forEach
            studentList.forEach((student) -> System.out.println(student.toString()));
        } 
    }
    
    public static void removeStudent(LinkedList<Student> studentList, Scanner scnr) { 
        // remove student from inventory based on index from user input
        try {
            System.out.print("Enter studentList index to remove: ");
            int index = scnr.nextInt();
            studentList.remove(index);
            System.out.printf("student index: %d removed\n", index);
        }
        catch (InputMismatchException e) {
            System.err.println("must enter integer for student index");
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("student index not found");
        }
    }
    
    public static void updateStudent(LinkedList<Student> studentList, Scanner scnr) {
        // access student class getters for selected student index in inventory
        try {
            System.out.print("Enter an student index to update: ");
            int index = scnr.nextInt();
            scnr.nextLine();
            System.out.println(studentList.get(index).toString());
            System.out.print("Enter field to update: ");
            String field = scnr.nextLine();
            if (field.equalsIgnoreCase("gpa")) {
                System.out.print("Enter new value: ");
                studentList.get(index).setGpa(scnr.nextDouble());
                System.out.println("GPA updated");
            }
            else if (field.equalsIgnoreCase("name")) {
                System.out.print("Enter new value: ");
                studentList.get(index).setName(scnr.nextLine());
                System.out.println("name updated");
            }
            else if (field.equalsIgnoreCase("address")) {
                System.out.print("Enter new value: ");
                studentList.get(index).setAddress(scnr.nextLine());
                System.out.println("address updated");
            }
            else {
                System.out.println("Field not found");
            }
        }
        catch (InputMismatchException e) {
            System.err.println("must enter correct data type for each field");
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("student index not found");
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void exportStudentList(LinkedList<Student> studentList, Scanner scnr) {
        // export inventory to file in current directory
        System.out.print("Enter file path and name: ");
        String filePath = scnr.nextLine();

        // Try-with-resources to ensure the file is closed after writing
        try (FileWriter fileWriter = new FileWriter(filePath);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            studentList.forEach((student) -> printWriter.println(student.toString()));
            System.out.println("export to file successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }  
}
