public class BankAccount {
    // Fields
    protected String firstName;
    protected String lastName;
    protected int accountID;
    protected double balance;

    // Methods
    // constructor():  initialize balance to zero
    public BankAccount(String firstName, String lastName, int accountID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0;
    }
    // deposit() - will accept a single value double parameter; the parameter value is added to the existing balance
    // withdrawal() - accepts a single value double dollar amount; the parameter value is subtracted from the existing balance
    // Setters and getters for firstName, lastName, and accountID
    // getBalance() getter to return the balance
    // accountSummary() - prints all account information
    public void accountSummary() {
        String summaryString = String.format("First Name: %s \nLast Name: %s \nAccount ID: %d \nBalance: $%.2f",
        firstName,
        lastName,
        accountID,
        balance);
        System.out.println(summaryString);
    }
}
