package gr.aueb.cf.ch8;

import java.io.IOException;

public class CharReadApp2 {
    public static void main(String[] args) {

    }

    public static String getString() {
        char[] tokens = new char[2];
        String str = "";
        System.out.println("please insert two chars");
        try {
            for (int i = 0; i < tokens.length; i++) {
                tokens[i] = (char) System.in.read();
                str += tokens[i];
            }

        } catch (IOException e) {
            e.printStackTrace();
        }return str;
    }
}

