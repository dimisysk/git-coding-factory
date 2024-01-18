package gr.aueb.cf.ch6;

public class StringBackApp {
    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i) );
        }
    }
}
