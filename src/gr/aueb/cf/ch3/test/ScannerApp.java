package gr.aueb.cf.ch3.test;

import java.util.Scanner;

/**
 * scanner Demo. Reads two ints from
 * stdin and prints the sum.
 */
public class ScannerApp {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        int num1;
        int num2;
        int sum;
        // Εντολές
        System.out.println("please insert two integers.");
        num1 =  in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("sum of %d + %d = %d\n",num1 , num2, sum);

    }
}
