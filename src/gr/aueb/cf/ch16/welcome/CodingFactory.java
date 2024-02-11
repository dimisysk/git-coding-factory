package gr.aueb.cf.ch16.welcome;

public class CodingFactory implements  IWelcome{
    @Override
    public void saySomething(String message) {
        System.out.println("Please Write the message.");
    }

    @Override
    public void sayHelloCodingFactory() {
        IWelcome.super.sayHelloCodingFactory();
        System.out.println("\u2764".repeat(5));
    }
}
