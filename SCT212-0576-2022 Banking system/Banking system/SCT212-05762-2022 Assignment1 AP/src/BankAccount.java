/**Overview:
 * The BankAccount class models a simple bank account with basic functionalities
 * such as depositing funds, withdrawing funds, and checking the account balance.
    **/
    public class BankAccount {
    private double balance;
/**
     * Constructor to initialize a BankAccount with a specified balance.
     * @param balance The initial balance of the account.
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }
  /**
     * Adds the specified amount to the account balance.
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        balance += amount;
    }
/**
     * Deducts the specified amount from the account balance if sufficient funds are available.
     * Prints an error message if there are insufficient funds.
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
    }
 /**
     * Returns the current balance of the bank account.
     * @return The current account balance.
     */
    public double getBalance() {
        return balance;
    }
}
