package gr.aueb.cf.ch6;

/**
 * Return the max number of
 * cars they are parked
 * at the same time.
 */

public class ParkingApp {

    public static void main(String[] args) {
        // testing our method here
        int[][] array = {
                {1012,1},
                {1136,0},
                {1317,1},
                {1417,0},
                {1015,1},
                {1020,0}
        };
        System.out.println(sortedCars(array));

    }

    /**
     * @param arr   the source 2D array.
     * @param maxCars   the max number of cars
     * @param currentCars  the number of cars in a specific time
     * @return      the maxCars
     */
    public static int sortedCars(int[][] arr) {
        // Sort the array
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j <= arr.length -1; j++) {
                if (arr[j][0] < arr[i][0]) {
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int maxCars = 0;
        int currentCars = 0;

        // Count the maximum number of cars
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] == 1) {
                currentCars++;
                if (currentCars > maxCars) {
                    maxCars = currentCars;
                }
            } else {
                currentCars--;
            }
        }

        return maxCars;
    }


}

/**
 * public static int getMaxCarsAtSameTime(int[][] arr) {
 *     // Sort the array based on time (first column)
 *     Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
 *
 *     int maxCars = 0;
 *     int currentCars = 0;
 *
 *     // Count the maximum number of cars parked at any given time
 *     for (int i = 0; i < arr.length; i++) {
 *         if (arr[i][1] == 1) {
 *             currentCars++;
 *             if (currentCars > maxCars) {
 *                 maxCars = currentCars;
 *             }
 *         } else {
 *             currentCars--;
 *         }
 *     }
 *
 *     return maxCars;
 * }
 */