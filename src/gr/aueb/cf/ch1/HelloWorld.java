package gr.aueb.cf.ch1;

/**
 * Εκτυπώνει στην κονσόλα
 * την φράση Hello Coding Factory!
 *
 */

public class HelloWorld {
    public static void main(String[] args) {
        // Prints Hello Coding Factory!
        if (args.length != 1) return;
        System.out.println(args[0]);

        /*
        Prints Hello World

         */

        System.out.println("Hello World!");
    }
}
