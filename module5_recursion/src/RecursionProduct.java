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
    public static int recursionProduct(int[] intArray, int product) {
        // base case for when counter == 0
            // product *= array[0]
        // recursive case for when counter > 0
            // product *= recursionProduct(array[N-1])
        // return product
        return product;
    }      
    
    public static void main(String[] args) throws Exception {
        int[] intArray = getUserInput(5);
        for (int integer: intArray) {
            System.out.println(integer); 
        }
        int product = 0;
        System.out.println("The product is: " + recursionProduct(intArray, product));
    }
}
