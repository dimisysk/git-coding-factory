package gr.aueb.cf.ch14;

/**
 * Utility Class.
 * -private constractor
 * -no state
 * -public static method
 */

public class HelloUtil {

    /**
     * No instances of this class should be available.
     */

    private HelloUtil() {

    }

    public static void sayHello() {
        System.out.println("Hello Cf!!!");
    }
}
