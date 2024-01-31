package gr.aueb.cf.ch15.accounts.model;

import gr.aueb.cf.ch15.accounts.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch15.accounts.exceptions.SsnNotValidException;

public class OverdraftAcount extends  Account{

    public OverdraftAcount() {
    }


    public OverdraftAcount(String iban, User holder, double balance) {
        super(iban, holder, balance);
    }

    @Override
    public void withdraw(double amount, String ssn) throws SsnNotValidException {
        try {
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }
            setBalance(getBalance() - amount);

        } catch (SsnNotValidException e ) {
            System.err.println("Error " + e.getMessage());
            throw e;
        }
    }
}
