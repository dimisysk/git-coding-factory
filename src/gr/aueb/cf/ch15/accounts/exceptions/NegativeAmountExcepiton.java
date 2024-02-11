package gr.aueb.cf.ch15.accounts.exceptions;

public class NegativeAmountExcepiton extends Exception{
    private static final long serialVersionUID = 3245L;

//    public NegativeAmountExcepiton() {
//        super("Amount insufficient");
//    }

    public NegativeAmountExcepiton(double amount) {
        super("Amount " + amount + "is not sufficient.");
    }
}
