/*
 * Using recursion, create a program that will allow a user to enter five numbers. 
 * The program will provide the product of all five numbers using recursive methods.
 */
public class RecursionProduct {
    // Declare variables
        // counter for number of numbers allowed
        // scanner for user input
        // array to store numbers
        // int to store product 

    // define recursionProduct method
    public static int recursionProduct() {
        // base case for when counter == 0
            // product *= array[0]
        // recursive case for when counter > 0
            // product *= recursionProduct(array[N-1])
        // return product
        return 0;
    }      
    
    public static void main(String[] args) throws Exception {
        System.out.println("The product is: " + recursionProduct());
    }
}
