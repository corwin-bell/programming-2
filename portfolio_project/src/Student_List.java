import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.lang.IndexOutOfBoundsException;
public class Student_List {
    
    // TODO: update all mentions of autos to students
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
                else if (command.equalsIgnoreCase("listStudends")) {
                    listStudends(studentList);
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
        // add new auto to studentList inventory
        try {
            System.out.println("Enter make(String)");
            String make = scnr.next();
            System.out.println("Enter model(String)");
            String model = scnr.next();
            System.out.println("Enter color(String)");
            String color = scnr.next();
            System.out.println("Enter year(int)");
            int year = scnr.nextInt();
            System.out.println("Enter mileage(int)");
            int mileage = scnr.nextInt();
            
            Student auto = new Student(make, model, color, year, mileage);
            studentList.add(auto);
            System.out.println("auto added");
        }
        catch (InputMismatchException e) {
            System.err.println("must enter correct data type for each field");
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static void listStudends(LinkedList<Student> studentList) {
        // print all autos in inventory to a new line
        if (studentList.isEmpty()) {
            System.out.println("Auto inventory is empty, add an auto in order to list an inventory.");
        }
        else {
            studentList.forEach((auto) -> System.out.println(auto.getautoInfo()));
        } 
    }
    
    public static void removeStudent(LinkedList<Student> studentList, Scanner scnr) { 
        // remove auto from inventory based on index from user input
        try {
            System.out.print("Enter studentList index to remove: ");
            int index = scnr.nextInt();
            studentList.remove(index);
            System.out.printf("Auto index: %d removed\n", index);
        }
        catch (InputMismatchException e) {
            System.err.println("must enter correct data type for each field");
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("Auto index not found");
        }
    }
    
    public static void updateStudent(LinkedList<Student> studentList, Scanner scnr) {
        // access auto class getters for selected auto index in inventory
        try {
            System.out.print("Enter an auto index to update: ");
            int index = scnr.nextInt();
            scnr.nextLine();
            System.out.println(studentList.get(index).getautoInfo());
            System.out.print("Enter field to update: ");
            String field = scnr.nextLine();
            if (field.equalsIgnoreCase("make")) {
                System.out.print("Enter new value: ");
                studentList.get(index).setMake(scnr.nextLine());
                System.out.println("make updated");
            }
            else if (field.equalsIgnoreCase("model")) {
                System.out.print("Enter new value: ");
                studentList.get(index).setModel(scnr.nextLine());
                System.out.println("model updated");
            }
            else if (field.equalsIgnoreCase("color")) {
                System.out.print("Enter new value: ");
                studentList.get(index).setColor(scnr.nextLine());
                System.out.println("color updated");
            }
            else if (field.equalsIgnoreCase("year")) {
                System.out.print("Enter new value: ");
                studentList.get(index).setYear(scnr.nextInt());
                System.out.println("year updated");
            }
            else if (field.equalsIgnoreCase("mileage")) {
                System.out.print("Enter new value: ");
                studentList.get(index).setMileage(scnr.nextInt());
                System.out.println("mileage updated");
            }
            else {
                System.out.println("Field not found");
            }
        }
        catch (InputMismatchException e) {
            System.err.println("must enter correct data type for each field");
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("Auto index not found");
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void exportStudentList(LinkedList<Student> studentList, Scanner scnr) {
        // export inventory to file in current directory
        System.out.print("Enter file path: ");
        String filePath = scnr.nextLine();

        // Try-with-resources to ensure the file is closed after writing
        try (FileWriter fileWriter = new FileWriter(filePath);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            studentList.forEach((auto) -> printWriter.println(auto.getautoInfo()));
            System.out.println("export to file successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }  
}
