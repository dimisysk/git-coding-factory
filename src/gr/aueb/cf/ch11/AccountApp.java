package gr.aueb.cf.ch11;

public class AccountApp {
    public static void main(String[] args) {
        Account alice = new Account(1, "GE123", "Alice", "W", "A123", 1000 );
        Account bob = new Account(2, "GE1234", "Bob", "L", "A1234", 500 );

        try {
            alice.deposit(400.50);
            System.out.println("Successful deposit ");

            bob.withdraw(1200, "A1234");
            System.out.println("Successfull Withdraw");

            System.out.println(alice.accountToString());
            System.out.println(bob.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
