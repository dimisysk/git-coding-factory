package gr.aueb.cf.ch7;

import java.util.Scanner;
/**
 * Return an decrypted string
 * with the privious character
 * in ASCII system.
 * if the character is the 32th
 * character inn ascii,which is
 * the first printable character
 * then return the last prinable
 * character.
 */

public class TheDecryptionApp {
    public static void main(String[] args) {
        // testing our method here
        Scanner sc = new Scanner(System.in);
        System.out.println("please give a string that ends with ender");
        String userInput = sc.nextLine();
        System.out.println(decryption(userInput));
    }

    /**
     * @param       input   a string taken from user.
     * @param       decryptedString the new string
     * @param       asciiDec  an integer variable that converted the char to ascii number.
     * @return      the new decryptedString.
     */
    public static String decryption(String input) {
        int asciiDec;
        String decryptedString = "";
        for (int i = 0; i < input.length();i++) {
            asciiDec = input.charAt(i);
            if (asciiDec == 32) {       //first printable character
                asciiDec = 255;         // last printable character
            } else {
                asciiDec--;
            }
            decryptedString+= (char)asciiDec;
        } return decryptedString;
    }
}
