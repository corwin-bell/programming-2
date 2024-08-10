/*
 * Using recursion, create a program that will allow a user to enter five numbers. 
 * The program will provide the product of all five numbers using recursive methods.
 */

import java.util.Scanner;

public class RecursionProduct {
    
    // get set of integers from user
    public static int[] getUserInput(int counter) {
        try (Scanner scnr = new Scanner(System.in);) {
            System.out.printf("Enter %d integers separated with a space:", counter);
            int[] intArray = new int[counter];
            for (int i = 0; i < counter; i++) {
                intArray[i] = scnr.nextInt();
            }
            return intArray;
        }
    }
    // define recursionProduct method
    public static int recursionProduct(int[] intArray, int counter, int product) {
        // base case for when counter == 0
        if (counter == 0) {
            product *= intArray[counter];
            System.out.printf("Current index is: %d \nProduct is: %d\n", counter, product);
            return product;
        }
        // recursive case for when counter > 0 
        else {
            product *= intArray[counter];
            System.out.printf("Current index is: %d \nProduct is: %d\n", counter, product);
            return recursionProduct(intArray, counter - 1, product);
        }
    }      
    
    public static void main(String[] args) throws Exception {
        int counter = 5;
        int[] intArray = getUserInput(counter);
        int product = 1;
        System.out.println("The product is: " + recursionProduct(intArray, counter - 1, product));
    }
}
