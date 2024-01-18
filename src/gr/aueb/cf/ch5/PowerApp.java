package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int n = 0;
        int result = 0;


        System.out.println("Please insert base and power");
        a = input.nextInt();
        n = input.nextInt();
        result = pow(a, n);

        System.out.printf("%d^%d = %d",a,n,result);
    }


    public static int pow(int a, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        return result;

    }

}

