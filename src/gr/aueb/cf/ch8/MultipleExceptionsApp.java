package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {
    public static void main(String[] args) {
        File file = new File("C:/Users/syska/OneDrive/Desktop/αρχεια/new.txt");

        try (Scanner in = new Scanner(file)) {
            int ch = System.in.read();
            int num = in.nextInt();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Error: File not found");
        }
        catch (IOException e1) {
            e1.printStackTrace();
            System.err.println("Error: IO exception");
       }
        catch ( Exception e2) {
            e2.printStackTrace();
            System.err.println("Error: Generic Exception Error");
        }
    }
}
