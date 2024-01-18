package gr.aueb.cf.ch6;

/**
 * Return the intex position
 * of the Max value.
 */

public class MaxPositionApp {
    public static void main(String[] args) {
        // here testing our method
        int[] array = { 4, 8, 2, 10, 5 };
        int low = 3;
        int high = 4;
        int position = maxPos(array,low,high);
        if (position != -1) {
            System.out.println("The maximum value in the range [" + low + ", " + high + "] is at position: " + position);
        } else {
            System.out.println("Invalid input or range.");
        }
    }

    /**
     * @param arr   the source array.
     * @param low   the lower position of the requested array
     * @param high  the higher position of the requested array
     * @return      the position of the Max value
     */
    public static int maxPos(int[] arr, int low, int high) {
        if (arr == null || low < 0 || low > high || high > arr.length - 1) {
            return -1;
        }

        int maxValue = Integer.MIN_VALUE; // Initialize with minimum possible
        int maxPosition = low; // Initialize the position with the lower index

        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
