package gr.aueb.cf.ch8;

import java.io.IOException;
import java.util.Arrays;

public class CahrReadApp3 {
    public static void main(String[] args) {
        String s;
        try {
            s = getString();
            System.out.println(s);
        } catch (IOException e) {
            System.out.println("Error in read.");
        }

    }

    public static String getString() throws IOException {
        char[] tokens = new char[2];
        String str = "";
        System.out.println("please insert two chars");
        try {
            for (int i = 0; i < tokens.length; i++) {
                tokens[i] = (char) System.in.read();

            }

        } catch (IOException e) {
            e.printStackTrace(); //log
            throw e; // rethrow
        }return Arrays.toString(tokens);
    }
}


