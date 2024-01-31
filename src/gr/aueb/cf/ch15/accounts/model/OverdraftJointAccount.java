package gr.aueb.cf.ch15.accounts.model;

import gr.aueb.cf.ch15.accounts.exceptions.SsnNotValidException;

public class OverdraftJointAccount extends OverdraftAcount {
    private User secondUser;

    public OverdraftJointAccount() {
    }

    public OverdraftJointAccount(User secondUser) {
        this.secondUser = secondUser;
    }

    public OverdraftJointAccount(String iban, User holder, double balance, User secondUser) {
        super(iban, holder, balance);
        this.secondUser = secondUser;
    }

    @Override
    public void withdraw(double amount, String ssn) throws SsnNotValidException {
        if (secondUser.getSsn().equals(ssn)) {
            setHolder(secondUser);
        }
        super.withdraw(amount,ssn);
    }
}
