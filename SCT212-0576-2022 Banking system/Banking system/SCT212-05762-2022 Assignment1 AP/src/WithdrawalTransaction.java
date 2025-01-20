/**
Overview:
 * The WithdrawalTransaction class represents a withdrawal transaction applied 
 * to a bank account. It extends the BaseTransaction class and implements the 
 * apply and reverse methods to handle withdrawals and their potential reversals.
    **/
import java.util.Calendar;

public class WithdrawalTransaction extends BaseTransaction {
    
    private boolean reversed = false;
      /**
     * Constructor to initialize a WithdrawalTransaction with amount, date, and transaction ID.
     * @param amount The monetary value of the withdrawal.
     * @param date The date of the withdrawal transaction.
     * @param transactionID The unique identifier for the withdrawal transaction.
     */

    public WithdrawalTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }
     /**
     * Applies the withdrawal to the specified bank account if sufficient funds are available.
     * @param ba The bank account from which the amount is withdrawn.
     */

    @Override
    public void apply(BankAccount ba) {
        if (ba.getBalance() < getAmount()) {
            System.out.println("Insufficient funds for withdrawal.");
            return;
        }
        ba.withdraw(getAmount());
        System.out.println("Withdrawn: " + getAmount());
    }
/**
     * Reverses the withdrawal by depositing the amount back into the bank account if not already reversed.
     * @param ba The bank account to which the reversal applies.
     */
    @Override
    public void reverse(BankAccount ba) {
        if (!reversed) {
            ba.deposit(getAmount());
            reversed = true;
            System.out.println("Reversed withdrawal: " + getAmount());
        } else {
            System.out.println("Transaction already reversed.");
        }
    }
}

