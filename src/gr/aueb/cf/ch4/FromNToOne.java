package gr.aueb.cf.ch4;

import java.util.Scanner;

public class FromNToOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        System.out.println("please give number of stars");
        n = input.nextInt();

        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


}
