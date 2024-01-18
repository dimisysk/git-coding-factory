package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOrOddApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = 0;
        System.out.printf(" Please give number for checking\n");
        user = input.nextInt();


        System.out.println(isEven(user));
        System.out.println(isOdd(user));

    }
    public static boolean isEven(int a){
        return  (a % 2 )== 0;
    }
    public static boolean isOdd(int a){

        return !isEven(a);
   }
}

