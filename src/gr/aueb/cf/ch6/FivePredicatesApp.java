package gr.aueb.cf.ch6;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Check if the given numbers
 * pass the five specific
 * predicates
 */

public class FivePredicatesApp {
    // testing our methods here
    // and if the user's given numbers
    // pass the five predicates
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[6];

            System.out.println("Enter six integers from 1 to 49:");

            for (int i = 0; i < 6; i++) {
                numbers[i] = scanner.nextInt();
                if (numbers[i] < 1 || numbers[i] > 49) {
                    System.out.println("Please enter integers between 1 and 49.");
                    return;
                }
            }

            if (filterEven(numbers)) {
                System.out.println("There is no more than 3 even numbers.");

            } else  {
                System.out.println("There is more than 3 even numbers.");

            }

            if (filterOdd(numbers)) {
                System.out.println("There is no more than 3 odd numbers.");
            } else {
                System.out.println("There is more than 3 odd numbers.");

            }

            if (filterConsecutive(numbers)) {
                System.out.println("There is no more than 3 consecutive numbers in a row.");
            } else {
                System.out.println("There is more than 3 consecutive numbers in a row.");
            }

            if (filterSame(numbers)) {
                System.out.println("There is no more than 3 numbers with the same ending.");
            } else {
                System.out.println("There is more than 3 numbers with the same ending.");
            }

            if (filterSameTen(numbers)) {
                System.out.println("There is no more than 3 numbers in the same ten.");
                return;
            } else {
                System.out.println("There is more than 3 numbers in the same ten.");
            }


        }


        // Return true if it has not more than 3 even numbers
        public static boolean filterEven(int[] numbers) {
            int evenCount = 0;

            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenCount++;
                }
            }

            return evenCount <= 3;
        }

    // Return true if it has not more than 3 odd numbers
        public static boolean filterOdd(int[] numbers) {
            int oddCount = 0;

            for (int number : numbers) {
                if (number % 2 != 0) {
                    oddCount++;
            }
        }

            return oddCount <= 3;
    }
        // Return true if it has not more than 3  consecutive numbers in a row
        public static boolean filterConsecutive(int[] numbers) {
            int count = 1;

            for (int i = 0; i <= numbers.length - 2; i++) {
                if (numbers[i] == numbers[i + 1] - 1) {
                    count++;
                    if (count > 3) {
                        return false;
                    }
                } else {
                    count = 1;
                }
            }
            return true;
        }

        // Return true if it has not more than 3 numbers with the same ending
        public static boolean filterSame(int[] numbers) {
            int[] lastDigit = new int[10];

            for (int i = 0; i <= numbers.length -1; i++) {
                lastDigit[numbers[i] % 10]++;

                if (lastDigit[numbers[i] % 10] > 3) {
                    return false;
                }
            }
            return true;
        }

        // Return true if it has not more than 3 numbers in the same ten
        public static boolean filterSameTen(int[] numbers) {
            int[] tenCount = new int[5];

            for (int number : numbers) {
                tenCount[(number - 1) / 10]++;
            }
            for (int count : tenCount) {
                if (count > 3) {
                    return false;
                }
            }
            return true;
        }
    }


