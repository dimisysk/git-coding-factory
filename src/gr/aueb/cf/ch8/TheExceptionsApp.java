package gr.aueb.cf.ch8;


import java.util.Scanner;

/**
 *Αn App with  three
 * methods that
 * handles exceptions
 */

public class TheExceptionsApp {

    /**
     * The main  that it catches
     * the exception of the
     * three methods
     * the choiceMenu method
     * the getChoice method
     * and the printChoice method
     */
    public static void main(String[] args) {
        try {
            int choice;
            System.out.println("Welcome! Please choose an option:\n");
            do {
                choiceMenu();
                choice = getChoice();
                printChoice(choice);
            } while (choice != 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Number out of range 1-5. Please give a correct number.\n");
        }
    }

    /**
     * A method without parameters,
     * it just prints the menu
     */
    public static void choiceMenu() {
        System.out.println("1. Option for insert.");
        System.out.println("2. Option for delete.");
        System.out.println("3. Option for update.");
        System.out.println("4. Option for search.");
        System.out.println("5. Exit\n");
    }

    /**
     * @param       an input from the user that should be between 1 and 5
     * @return      choice
     * @throws      IllegalArgumentException
     */
    public static int getChoice() throws  IllegalArgumentException {
        int choice = 0;
        Scanner in = new Scanner(System.in);
//        try (Scanner in = new Scanner(System.in))
        try {
            while (true) {
                if (!in.hasNextInt()) {
                    System.out.println("Please give an integer between 1 and 4 or 5 for exit.\n");
                    in.nextLine();
                    continue;
                }
                choice = in.nextInt();
                if (choice < 1 || choice > 5) {
                    // System.out.println("Error: Number out of range 1-5. Please give a correct number");
                }
                return choice;
            }
        } catch (IllegalArgumentException e1) {
            e1.printStackTrace();
            throw e1;
        }
    }

    /**
     *
     * @param       choice is an integer between 1 and 5
     */
    public static void printChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("You chose inserting.\n");
                break;
            case 2:
                System.out.println("You chose deleting.\n");
                break;
            case 3:
                System.out.println("You chose updating.\n");
                break;
            case 4:
                System.out.println("You chose searching.\n");
                break;
            case 5:
                System.out.println("Exiting.\n");
                break;
        }
    }
}