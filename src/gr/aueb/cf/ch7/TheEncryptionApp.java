package gr.aueb.cf.ch7;
import java.util.Scanner;

/**
 * Return an encrypted string
 * with the next character
 * in ASCII system.
 * if the character is the 255th
 * character inn ascii
 * then return the first prinable
 * character which is the white space.
 */
public class TheEncryptionApp {
    public static void main(String[] args) {
        // testing our method here
        Scanner sc = new Scanner(System.in);
        System.out.println("please give a string that ends with ender");
        String userInput = sc.nextLine();
        System.out.println(encryption(userInput));
    }

    /**
     * @param       input   a string taken from user.
     * @param       encryptedString the new string
     * @param       asciiDec  an integer variable that converted the char to ascii number.
     * @return      the new encryptedString.
     */
    public static String encryption(String input) {
        int asciiDec;
        String encryptedString = "";
        for (int i = 0; i < input.length();i++) {
            asciiDec = input.charAt(i);
            if (asciiDec == 255) {
                asciiDec = 32;  // first printable character
            } else {
                asciiDec++;
            }
            encryptedString+= (char)asciiDec;
            } return encryptedString;
        }
    }
