package gr.aueb.cf.ch6;

/**
 * Returns the second
 * smallest Number.
 * Ιn case the smallest number
 * appears more than once,
 * it shows us the exact
 * next smallest
 */
public class SecondSmallestApp {
    public static void main(String[] args) {
// here testing our method

        int[] array = { 1,1,4, 8, 2,2,2,2, 10, 5 };
        System.out.println("The second smallest value is " + nextMinValue(array));
    }

    /**
     * @param arr           the source array.
     * @param minValue1     the lowest value in the array
     * @param minValue2     the secont lower value in the array
     * @return              the secont lower value
     */
    public static int nextMinValue(int[] arr) {
        int minValue1 = Integer.MAX_VALUE;
        int minValue2 = Integer.MAX_VALUE;

        if (arr == null || arr.length < 2) {
            return -1;
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue1) {
                minValue2 = minValue1;
                minValue1 = arr[i];
            } else if (arr[i] < minValue2 && arr[i] != minValue1) {
                minValue2 = arr[i];
            }
        }

        return minValue2;
    }

}

