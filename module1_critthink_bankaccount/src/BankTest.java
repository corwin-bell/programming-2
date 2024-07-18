public class BankTest {
    public static void main(String[] args) throws Exception {
        BankAccount myAccount = new BankAccount("Corwin", "Bell", 1);
        myAccount.accountSummary();
        myAccount.deposit(10);
        System.out.printf("expecting balance to be $10.00, got $%.2f\n", myAccount.getBalance());
        myAccount.withdrawal(10);
        System.out.printf("expecting balance to be $0, got $%.2f\n", myAccount.getBalance());
        // would be cool to use assertions but it's not working :(
        // assert myAccount.getBalance() == 10 : "deposit was " + myAccount.getBalance() + ". Should be 10";
        CheckingAccount myCheckingAccount = new CheckingAccount("Corwin", "Bell", 2, 0.085);
        myCheckingAccount.accountSummary();
    }
}
