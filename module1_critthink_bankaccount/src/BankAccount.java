public class BankAccount {
    // Fields
    protected String firstName;
    protected String lastName;
    protected int accountID;
    protected double balance;

    // Methods
    // constructors
    public BankAccount() {
        this.firstName = "unknown";
        this.lastName = "unknown";
        this.accountID = 0;
        this.balance = 0;
    }
    public BankAccount(String firstName, String lastName, int accountID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0;
    }
    // deposit() - will accept a single value double parameter; the parameter value is added to the existing balance
    public void deposit(double amountIn) throws Exception{
        if (amountIn < 0) {
            throw new Exception(String.format("NegativeNumberException: deposit amount (%.2f) not allowed, must be a postive number", amountIn));
        }
        else {
            balance += amountIn;
        }
    }
    // withdrawal() - accepts a single value double dollar amount; the parameter value is subtracted from the existing balance
    public void withdrawal(double amountOut) throws Exception{
        if (amountOut < 0) {
            throw new Exception(String.format("NegativeNumberException: deposit amount (%.2f) not allowed, must be a postive number", amountOut));
        }
        else {
            balance -= amountOut;
        }
    }
    // Setters and getters for firstName, lastName, and accountID
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    // getBalance() getter to return the balance
    public double getBalance() {
        return balance;
    }
    // accountSummary() - prints all account information
    public String accountSummary() {
        return String.format("First Name: %s, Last Name: %s, Account ID: %d, Balance: $%.2f, ",
        firstName,
        lastName,
        accountID,
        balance);
    }
}
