public class CheckingAccount extends BankAccount{
    private double interestRate;

    // Constructor adding to super constructor
    CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    // Methods
    // processWithdrawal - display negative balance that includes a $30 overdraft fee.
    public void processWithdrawal(double amountOut) throws Exception{
        if (amountOut < 0) {
            throw new Exception(String.format("NegativeNumberException: deposit amount (%.2f) not allowed, must be a postive number", amountOut));
        }
        else {
            if (balance - amountOut < 0) {
                withdrawal(amountOut + 30);
                System.out.println("$30 overdraft fee included due to negative balance."); 
                }
            else {
                withdrawal(amountOut);
            }
        }
    }
    // displayAccount() - should display all superclass attributes and provides an additional interest rate
    @Override
    public String accountSummary() {
        return super.accountSummary() + String.format("Interest rate: %.2f%%\n", interestRate * 100);
    }
}
