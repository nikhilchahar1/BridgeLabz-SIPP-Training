import java.util.Arrays;

public class MergeSort {

    // Merge Sort function
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively sort first half
            mergeSort(prices, left, mid);
            // Recursively sort second half
            mergeSort(prices, mid + 1, right);
            // Merge sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Merge function to merge two sorted halves
    public static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = prices[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = prices[mid + 1 + j];

        // Merge temp arrays back into prices[]
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                prices[k] = L[i];
                i++;
            } else {
                prices[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            prices[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            prices[k] = R[j];
            j++;
            k++;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] bookPrices = {499, 299, 999, 199, 599, 399};

        System.out.println("Original Prices: " + Arrays.toString(bookPrices));

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted Prices (Ascending): " + Arrays.toString(bookPrices));
    }
}