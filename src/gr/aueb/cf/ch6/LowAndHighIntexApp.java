package gr.aueb.cf.ch6;

/**
 * Returns the first
 * and the last index
 * position of the key
 * value.
 */
import java.util.Arrays;

public class LowAndHighIntexApp {
    public static void main(String[] args) {
// here testing our method
        int[] array = { 1,1,4,4,4,8,8,8,2,2,2,2,10,5 };
        System.out.println(Arrays.toString(getLowAndHighIndexOf(array,8)));
    }

    /**
     * @param arr           the source array.
     * @param low           the lower index from the key value
     * @param high          the higher index from the key value
     * @indexTable          the αρραυ where the lower and higher position are settled
     * @return              an array with the lower and higher indexing position
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] indexTable = new int[2];
        int low = -1;
        int high = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (low == -1) {
                    low = i;
                }
                high = i;
            }
        }
        if (low == -1 && high == -1) {
            // Key not found in the array
            return null;
        }
        indexTable[0] = low;
        indexTable[1] = high;
        return indexTable;
    }

}


