package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FlushApp {

    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("C:\\Users\\syska\\Dokumente\\Coding_Factory\\Java\\files\\f5.txt");
             PrintStream ps = new PrintStream("C:\\Users\\syska\\Dokumente\\Coding_Factory\\Java\\files\\f6.txt");
             Scanner in = new Scanner(System.in)) {
            pw.println("hello  Factory");
            ps.println("Hello Boys");
            //pw.flush();
            System.out.println("Please give an integer");
            in.nextInt();
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("File not found");
        }
    }
}
