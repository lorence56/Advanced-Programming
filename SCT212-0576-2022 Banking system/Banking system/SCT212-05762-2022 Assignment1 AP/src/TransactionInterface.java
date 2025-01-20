/**
 Overview:
 * The TransactionInterface defines the contract for all transaction types. 
 * It includes methods for retrieving transaction details, printing them, 
 * applying a transaction to a bank account, and reversing the transaction 
 * when applicable.
     **/
import java.util.Calendar;

public interface TransactionInterface {
     /**
     * Retrieves the monetary value of the transaction.
     * @return The transaction amount.
     */
    double getAmount();
     /**
     * Retrieves the date of the transaction.
     * @return The transaction date.
     */
    Calendar getDate();
    /**
     * Retrieves the unique identifier for the transaction.
     * @return The transaction ID.
     */
    String getTransactionID();
     /**
     * Prints the transaction details, including ID, date, and amount.
     */
    void printTransactionDetails();
    /**
     * Applies the transaction to the specified bank account.
     * @param ba The bank account to which the transaction is applied.
     */
    void apply(BankAccount ba);
     /**
     * Reverses the transaction on the specified bank account.
     * @param ba The bank account to which the reversal applies.
     * @throws Implementation-dependent exceptions if reversal is unsupported or fails.
     */
    void reverse(BankAccount ba); // Added to interface for consistency
}
