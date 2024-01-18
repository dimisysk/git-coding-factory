package gr.aueb.cf.ch8;

import java.io.IOException;

public class CharReadApp {
    public static void main(String[] args) {

    }

    public static String getString() throws IOException {
        char[] tokens = new char[2];
        String str = "";
        System.out.println("please insert two chars");

            for (int i = 0; i < tokens.length; i++) {
                tokens[i] = (char) System.in.read();
                str += tokens[i];
        }return str;
    }
}
