public class CheckingAccount extends BankAccount{
    // Has an interest rate attribute
    private double interestRate;

    CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    // Allows overdraft withdrawals and charges a $30 fee
    // Methods:
    // processWithdrawal() - will display a negative balance that includes a $30 overdraft fee and denotes that a fee has been accessed
    // shouldn't this override BankAccount.withdrawal?
    public void processWithdrawal(double amountOut) {
        if (balance - amountOut < 0) {
            withdrawal(amountOut + 30);
            System.out.println("$30 overdraft fee included due to negative balance.");
        }

    }
    // displayAccount() - should display all superclass attributes and provides an additional interest rate
    @Override
    public void accountSummary() {
        super.accountSummary();
        System.out.printf("Interest rate: %.2f%%\n", interestRate * 100);
    }
}
