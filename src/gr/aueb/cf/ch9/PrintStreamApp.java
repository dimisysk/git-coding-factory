package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:\\Users\\syska\\Dokumente\\Coding_Factory\\Java\\files\\f1.txt")) {
            ps.println("hello Coding Factory");
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("File not found");
        }

    }
}
