package gr.aueb.cf.ch6;
import java.util.Arrays;

/**
 * Return the max number of
 * cars they are parked
 * at the same time.
 */
public class CarsApp {
    public static void main(String[] args) {
        // testing our method here
        int[][] array = {
                {1110, 1129},
                {1155, 1221},
                {1012, 1033},
                {1009, 1023}
        };
        System.out.println(carsAppAlernative(array));

    }
    /**
     * @param arr   the source 2D array.
     * @param maxCars   the max number of cars
     * @param currentCars  the number of cars in a specific time
     * @return      the maxCars
     */
    public static int carsAppAlernative(int arr[][]) {
        int maxCars = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int currentCars = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i][0] <= arr[j][1] && arr[i][0] >= arr[j][0]) {
                    currentCars++;
                    if (currentCars > maxCars) {
                        maxCars = currentCars;
                    }
                }

            }
        }
        return maxCars;
    }
}


