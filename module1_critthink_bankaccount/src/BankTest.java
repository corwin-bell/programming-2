public class BankTest {
    public static void main(String[] args) throws Exception {
        // test parameterized constructor
        CheckingAccount myCheckingAccount = new CheckingAccount("Corwin", "Bell", 2, 0.085);
        System.out.println("expecting account summaries to match \n Input - First Name: Corwin, Last Name: Bell, Account ID: 2, Balance: $0.00, Interest Rate: 8.50% \nOutput - " + myCheckingAccount.accountSummary());

        // test deposit functionality
        myCheckingAccount.deposit(10);
        System.out.printf("expecting post-deposit balance to be $10.00, got $%.2f\n", myCheckingAccount.getBalance());
        try {
            myCheckingAccount.deposit(-50);
            System.out.println("expecting deposit error message for -50, got none");
        }
        catch (Exception e) {
            System.out.println("expecting deposit error message for -50, got " + e.getMessage());
        }
        // test withdrawal functionality 
        myCheckingAccount.withdrawal(10);
        System.out.printf("expecting post-withdrawal balance to be $0, got $%.2f\n", myCheckingAccount.getBalance());
        try {
            myCheckingAccount.withdrawal(-50);
            System.out.println("expecting withdrawl error message for -50, got none");
        }
        catch (Exception e) {
            System.out.println("expecting withdrawl error message for -50, got " + e.getMessage());
        }

        // test $30 overdraft fee functionality
        double overdraftTest = myCheckingAccount.getBalance() - (100 + 30);
        myCheckingAccount.processWithdrawal(100);
        System.out.printf("expecting overdraft withdrawal to be $%.2f, got $%.2f\n", overdraftTest, myCheckingAccount.getBalance());
        try {
            myCheckingAccount.processWithdrawal(-50);
            System.out.println("expecting withdrawl error message for -50, got none");
        }
        catch (Exception e) {
            System.out.println("expecting withdrawl error message for -50, got " + e.getMessage());
        }
    }
}
