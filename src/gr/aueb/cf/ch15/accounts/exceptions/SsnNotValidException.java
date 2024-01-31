package gr.aueb.cf.ch15.accounts.exceptions;

public class SsnNotValidException extends Exception{
    private static final long serialVersionUID = 45634L;

    public SsnNotValidException(String ssn) {
        super("Ssn " + ssn + "not valid.");
    }
}
