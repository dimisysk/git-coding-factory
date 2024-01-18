package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * FileOutputStream with true = append
 */

public class PrintStreamAutoFlash {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\syska\\temp\\f7.txt",true), true, StandardCharsets.UTF_8)) {
            ps.println("hello Coding Factory");
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("File not found");
        }
    }
}
