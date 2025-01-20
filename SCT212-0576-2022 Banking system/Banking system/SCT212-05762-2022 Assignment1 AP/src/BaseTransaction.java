import java.util.Calendar;

public abstract class BaseTransaction implements TransactionInterface {
    private double amount;
    private Calendar date;
    private String transactionID;
     /**
     * Constructor to initialize a BaseTransaction with amount, date, and transaction ID.
     * @param amount The monetary value of the transaction.
     * @param date The date of the transaction.
     * @param transactionID The unique identifier for the transaction.
     */

    public BaseTransaction(double amount, Calendar date, String transactionID) {
        this.amount = amount;
        this.date = date;
        this.transactionID = transactionID;
    }
    /**
     * Returns the transaction amount.
     * @return The monetary value of the transaction.
     */

    @Override
    public double getAmount() {
        return amount;
    }
 /**
     * Returns the date of the transaction.
     * @return The transaction date.
     */
    @Override
    public Calendar getDate() {
        return date;
    }
/**
     * Returns the unique transaction ID.
     * @return The transaction ID.
     */
    @Override
    public String getTransactionID() {
        return transactionID;
    }
 /**
     * Prints the transaction details, including ID, date, and amount.
     */
    @Override
    public void printTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Date: " + date.getTime());
        System.out.println("Amount: " + amount);
    }
/**
     * Abstract method to apply the transaction to the given bank account.
     * @param ba The bank account to which the transaction is applied.
     */
    @Override
    public abstract void apply(BankAccount ba);
  /**
     * Reverses the transaction on the given bank account. Throws an exception by default.
     * @param ba The bank account to which the transaction reversal applies.
     * @throws UnsupportedOperationException if reversal is not supported.
     */
    @Override
    public void reverse(BankAccount ba) {
        throw new UnsupportedOperationException("Reverse not supported for this transaction type.");
    }
}
