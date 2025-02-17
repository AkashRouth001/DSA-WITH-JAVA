import java.util.Scanner;

public class margeShort {
    // Dividing the array into subarrays and sorting them
    static void mshort(int[] arr, int low, int high) {
        if (low >= high) return; // Base condition
        int mid = (low + high) / 2;
        mshort(arr, low, mid);      // Sort the left half
        mshort(arr, mid + 1, high); // Sort the right half
        marge(arr, low, mid, high); // Merge the two sorted halves
    }

    // Merging the sorted subarrays
    static void marge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1]; // Temporary array for merging
        int left = low;       // Starting index of left subarray
        int right = mid + 1;  // Starting index of right subarray
        int tempIndex = 0;    // Index for the temp array

        // Merging the two subarrays in sorted order
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[tempIndex++] = arr[left++];
            } else {
                temp[tempIndex++] = arr[right++];
            }
        }

        // If elements on the left subarray are still left
        while (left <= mid) {
            temp[tempIndex++] = arr[left++];
        }

        // If elements on the right subarray are still left
        while (right <= high) {
            temp[tempIndex++] = arr[right++];
        }

        // Copying sorted elements from temp back to the original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        mshort(arr, 0, n - 1);

        System.out.println("After sorting array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
