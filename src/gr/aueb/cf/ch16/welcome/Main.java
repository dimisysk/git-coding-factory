package gr.aueb.cf.ch16.welcome;

public class Main {
    public static void main(String[] args) {
        IWelcome welcome = new CodingFactory();
        welcome.sayHelloCodingFactory();
    }
}
