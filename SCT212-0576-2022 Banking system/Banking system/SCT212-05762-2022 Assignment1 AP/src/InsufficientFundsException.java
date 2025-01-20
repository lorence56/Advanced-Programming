/**
 Overview:
 * The InsufficientFundsException class is a custom exception that indicates
 * an error condition where a transaction cannot proceed due to insufficient
 * funds in a bank account.
     **/
public class InsufficientFundsException extends Exception {
     /**
     * Constructor to initialize an InsufficientFundsException with a custom message.
     * @param message The error message associated with the exception.
     */
    public InsufficientFundsException(String message) {
        super(message);
    }
}
