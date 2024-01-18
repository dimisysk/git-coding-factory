package gr.aueb.cf.ch11;

/**
 *  Driver class
 */
public class Main {
    public static void main(String[] args) {
        Student alice = new Student();

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");

        System.out.println("ID: " + alice.getId());
        System.out.println("FIRSTNAME: " + alice.getFirstname());
        System.out.println("LASTNAME: " +alice.getLastname());
        System.out.println("Instances Count: " + Student.getInstancesCount());
    }
}
