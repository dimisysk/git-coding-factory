package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator =0;
        int denominator = 0;
        int result =0;

        while (true) {
            System.out.println("please insert a numerator (0 for exit) and a denominator");
            numerator = in.nextInt();
            if (numerator == 0) {
                System.out.println("Thank you for using our App");
                break;
            };
            denominator = in.nextInt();

            // State-dependent testing
            if (denominator ==0) {
                System.out.println("Error: Denominator is zero");
                continue;
            }
            result = div(numerator,denominator);

            System.out.println("Result: " + result);
        }
    }

    public static int div(int numerator, int denominator) {
        int result =0;

        result = (denominator ==0) ? ((numerator < 0 ) ? Integer.MIN_VALUE : Integer.MAX_VALUE ) : numerator / denominator;
        return result;
    }

    public static boolean isZero(int num) {
        return num == 0;
    }
}
