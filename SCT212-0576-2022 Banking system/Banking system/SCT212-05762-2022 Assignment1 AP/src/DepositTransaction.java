/** Overview:
 * The DepositTransaction class represents a deposit transaction applied to a 
 * bank account. It extends the BaseTransaction class and implements the 
 * apply method to add funds to the specified bank account. Reverse operations 
 * are not supported for deposit transactions.
    **/
import java.util.Calendar;

public class DepositTransaction extends BaseTransaction {
      /**
     * Constructor to initialize a DepositTransaction with amount, date, and transaction ID.
     * @param amount The monetary value of the deposit.
     * @param date The date of the deposit transaction.
     * @param transactionID The unique identifier for the deposit transaction.
     */
    public DepositTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }
        /**
     * Applies the deposit to the specified bank account.
     * @param ba The bank account to which the deposit is applied.
     */
    

    @Override
    public void apply(BankAccount ba) {
        ba.deposit(getAmount());
        System.out.println("Deposited: " + getAmount());
    }
      /**
     * Throws an exception as reversal of deposits is not supported.
     * @param ba The bank account to which the reversal would apply.
     * @throws UnsupportedOperationException if an attempt is made to reverse the deposit.
     */

    @Override
    public void reverse(BankAccount ba) {
        throw new UnsupportedOperationException("Reverse not allowed for deposits.");
    }
}

