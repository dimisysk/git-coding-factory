package gr.aueb.cf.ch7;
import java.util.Scanner;

/**
 * Return an Decrypted string
 * with the previous character
 * in ASCII system.
 * Except the space.
 */

public class DecryptionApp {
    // testing our method here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give a string that ends with return:");
        String input = sc.nextLine();
        encryption(input);
    }

    /**
     * @param       input   a string taken from user.
     * @return      print the encrypted string.
     */
    public static void encryption(String input) {
        for (char ch : input.toCharArray()) {
            int value;
            if (ch == ' ') {
                value = (int) ch;
            } else {
                value = ((int) ch) - 1;
            }
            System.out.print((char) value);
        }
    }
}
