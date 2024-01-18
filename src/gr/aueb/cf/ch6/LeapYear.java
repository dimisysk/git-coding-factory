package gr.aueb.cf;
import java.util.Scanner;

/**
 * Πρόγραμμα που υπολογίζει
 * αν έαμ Έτος είναι δίσεκτο ή όχι.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = 0;
        boolean isLeap = false;
        int i = 0;
        System.out.println("Παρακαλώ δώστε έτος για έλεγχο");
        year = input.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            isLeap = true;
            System.out.printf("Το έτος που δώσατε ( %d ) είναι δίσεκτο\n", year);
        } else {
            System.out.printf("Το έτος που δώσατε ( %d ) δεν είναι δίσεκτο\n", year);
        }

    }
}