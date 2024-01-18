package gr.aueb.cf.ch9;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class PrintStreamMethod {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:\\Users\\syska\\Dokumente\\Coding_Factory\\Java\\files\\f2.txt", StandardCharsets.UTF_8);
             PrintStream ps1 = new PrintStream("C:\\Users\\syska\\Dokumente\\Coding_Factory\\Java\\files\\f3.txt", StandardCharsets.ISO_8859_1);
             PrintWriter pw = new PrintWriter("C:\\Users\\syska\\Dokumente\\Coding_Factory\\Java\\files\\f4.txt","Windows-1252")) {
           // ps.println("hello Coding Factory");
            prinMsg(ps,"Hello Again!!!");
            prinMsg(System.out, "Hello to Std Output");
            prinMsg(ps1, "PAOKARA");
            pw.println("PAME PAOKARA");
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("File not found");
        }
    }

    public static void prinMsg(PrintStream ps,String message) {
        ps.println(message);
    }
}
