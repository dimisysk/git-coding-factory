package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ένα μενού που μας ζητάει να δώσουμε
 * επιλογή για το τι θέλουμε να εκτυπώσουμε
 */

public class MenuStarsApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = 0;
        int stars = 0;
        System.out.println("Please give a chose.");

        do {
            printMenu();
            userInput = input.nextInt();
            if (userInput == 6) {
                System.out.println("goodbye");
                break;
            } else if (userInput <= 0 || userInput > 6) {
                System.out.println("Chose out of range. Give a right chose");
                continue;
            }
            System.out.println("Δώστε αριθμό από αστεράκια");
            stars = input.nextInt();

            switch (userInput) {
                case 1:
                    horizontalStars(stars);
                    System.out.println();
                    break;
                case 2:
                    verticalStars(stars);
                    System.out.println();
                    break;
                case 3:
                    tableStars(stars);
                    System.out.println();
                    break;
                case 4:
                    ascendingStars(stars);
                    System.out.println();
                    break;
                case 5:
                    descendingStars(stars);
                    System.out.println();
                    break;
                case 6:
                    break;
            }
        } while (userInput != 6);
    }

    // Η μέθοδός μας που εκτυπώνει το βασικό μας μενου.
    public static void printMenu() {
        System.out.println("Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("Εμφάνισε n αστεράκια κάθετα");
        System.out.println("Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("Δώσε επιλογή");

    }

    // Η μέθοδος που Εκκτυπώνει τα οριζόντια αστεράκια
    public static void horizontalStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Η μέθοδος που Εκκτυπώνει τα κάθετα αστεράκια
    public static void verticalStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    // Η μέθοδος που Εκκτυπώνει τα nXn αστεράκια
    public static void tableStars(int n) {
        for (int i = 1; i <= n; i++) {
            horizontalStars(n);
            {
            }
            System.out.println("");
        }
    }

    // Η μέθοδος που Εκκτυπώνει  με αύξουσα σειρά τα αστεράκια
    public static void ascendingStars(int n) {
        for (int i = 1; i <= n; i++) {
            horizontalStars(i);
            {
            }
        }
    }

    // Η μέθοδος που Εκτυπώνει με φθύνουσα σειρά τα αστεράκια
    public static void descendingStars(int n) {
        for (int i = 0; i < n; i++) {
            horizontalStars(n - i);
            {
            }
        }
    }
}