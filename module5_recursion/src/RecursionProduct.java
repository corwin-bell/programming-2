/*
 * Using recursion, create a program that will allow a user to enter five numbers. 
 * The program will provide the product of all five numbers using recursive methods.
 */

import java.util.Scanner;

public class RecursionProduct {
    
    // get set of integers from user
    public static long[] getUserInput(int len) {
        // try with resources block to ensure scanner closes after use
        try (Scanner scnr = new Scanner(System.in);) {
            System.out.printf("Enter %d integers separated with a space:", len);
            long[] intArray = new long[len];
            for (int i = 0; i < len; i++) {
                intArray[i] = scnr.nextInt();
            }
            return intArray;
        }
    }
    // define recursionProduct method
    public static long recursionProduct(long[] intArray, int counter, long product) {
        // base case for when counter == 0
        if (counter == intArray.length - 1) {
            String printString = String.format("%d * %d = ", product, intArray[counter]); 
            product *= intArray[counter];
            System.out.println(printString + product);
            return product;
        }
        // recursive case for when counter > 0 
        else {
            String printString = String.format("%d * %d = ", product, intArray[counter]); 
            product *= intArray[counter];
            System.out.println(printString + product);
            return recursionProduct(intArray, counter + 1, product);
        }
    }      
    
    public static void main(String[] args) throws Exception {
        // setting input and product integers as long to support large integers
        long[] intArray = getUserInput(5);
        long product = 1;
        int counter = 0;
        System.out.println("The product is: " + recursionProduct(intArray, counter, product));
    }
}
