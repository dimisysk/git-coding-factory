package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final int MAGIC_SECRET = 12;

        while (true) {

            try {
                System.out.println("Please insert the magic num");
                inputNum = in.nextInt();
                System.out.println("You inserted:" + inputNum);
                if (inputNum == MAGIC_SECRET) {
                    System.out.println("you found it");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: invalid input token");
                in.nextLine();
            }
        }
    }
}
