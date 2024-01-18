package gr.aueb.cf;

import java.util.Scanner;

public class Malal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputeuros;
        final int PARITY = 99;
        int totUsCents, usacents,usaDollars;

        System.out.println("please insert an amount (in Euros)");
        inputeuros = in.nextInt();
        totUsCents = inputeuros * PARITY;
        usaDollars = totUsCents / 100;
        usacents = totUsCents % 100;

        System.out.printf("%d euros = %d USA dollars & %d USA cents", inputeuros
                ,usaDollars,usacents);
    }
}
