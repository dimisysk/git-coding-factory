package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ExceptionsApp {
    public static void main(String[] args) {
        choiceMenu();
    }
    public static void choiceMenu() {
        int choice;
        do {
            System.out.println("Welcome! Please choose an option:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Option 4");
            System.out.println("5. Exit\n");
            choice = getChoice();

            switch (choice) {
                case 1:
                    System.out.println("You chose Option 1.\n");
                    break;
                case 2:
                    System.out.println("You chose Option 2.\n");
                    break;
                case 3:
                    System.out.println("You chose Option 3.\n");
                    break;
                case 4:
                    System.out.println("You chose Option 4.\n");
                    break;
                case 5:
                    System.out.println("Exiting.\n");
                    break;
            }
        } while (choice != 5);
    }
    public static int getChoice() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try (in){
                System.out.print("Enter your choice: ");
                if (in.hasNextInt()) {
                    int choice = in.nextInt();
                    if (choice >= 1 && choice <= 5) {
                        return choice;
                    } else {
                        System.out.println("Please enter a number between 1 and 5.");
                    }
                } else {
                    System.out.println("Please enter a valid integer.");
                    in.nextLine();
                }
            } catch (Exception e) {
                in.nextLine();
                System.out.println("Please enter a valid input.");


            }

        }
    }

}

