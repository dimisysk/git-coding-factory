package gr.aueb.cf.ch15.accounts.exceptions;

public class InsufficientBalanceException extends Exception {
    private static final long serialVersionUID = 123_432L;

    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient balance" + balance + " for amount " + amount);
    }
}
