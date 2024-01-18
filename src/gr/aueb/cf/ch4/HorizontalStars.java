package gr.aueb.cf.ch4;

import java.util.Scanner;

public class HorizontalStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        System.out.println("please give number of stars");
        n = input.nextInt();

        for (int i = 1;  i <= n;  i++) {
            System.out.print("*");
        }

    }
}
