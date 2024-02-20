package gr.aueb.cf.ch3.test;

import java.util.Scanner;

/**
 *  Δημιουργία ενός προγράμματος
 *  Μενού επιλογών.
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userIput =  0;
        do {
            System.out.println("Παρακαλώ Δώστε Την Επιλογή Που επιθυμείτε.\n");
            System.out.println("1. Εισαγωγή\n");
            System.out.println("2. Διαγραφή\n");
            System.out.println("3. Ενημέρωση\n");
            System.out.println("4. Αναζήτηση\n");
            System.out.println("5. Εξοδος\n");
            userIput = input.nextInt();
            if (userIput == 1) {
                System.out.println("Η επιλογή σας είναι Εισαγωγή\n");
            } else if (userIput == 2) {
                System.out.println("Η επιλογή σας είναι Διαγραφή\n");
            } else if (userIput == 3) {
                System.out.println("Η επιλογή σας είναι Ενημέρωση\n");
            } else if (userIput == 4) {
                System.out.println("Η επιλογή σας είναι Αναζήτηση\n");
            } else if (userIput == 5) {
                System.out.println("Η επιλογή σας είναι Εξοδος\n");
            } else if ( userIput >= 5 || userIput <= 0) {
                System.out.println("Η επιλογή σας είναι μη έγκυρη.");
            }

        } while ( userIput != 5 );
    }
}

