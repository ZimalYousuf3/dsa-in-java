// Modified Binary Search Algorithm in Java (First and Last Position)

public class ModifiedBinarySearch {

    static int firstOccurrence(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;                       // Variable to store the index of the first occurrence

        while (low <= high) {

            int mid = low + (high - low) / 2; 

            if (arr[mid] == key) {
                result = mid ;                 // Store the index of the first occurrence
                high = mid - 1;                // Continue searching in the left half for the first occurrence
            }

            else if (arr[mid] < key) {
                low = mid + 1;                // key is in the upper half. Go to the right side of mid
            }

            else {
                high = mid - 1;               // key is in the lower half. Go to the left side of mid
            }
        }
        return result;                        // Return the index of the first occurrence (or -1 if not found)
    }

    static int lastOccurrence(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;                       // Variable to store the index of the last occurrence

        while (low <= high)  {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                result = mid ;                // Store the index of the last occurrence
                low = mid + 1;                // Continue searching in the right half for the last occurrence
            }

            else if (arr[mid] < key) {
                low = mid + 1;                // key is in the upper half. Go to the right side of mid
            }

            else {
                high = mid - 1;               // key is in the lower half. Go to the left side of mid
            }
        }
        return result;                        // Return the index of the last occurrence (or -1 if not found)
    }

    public static void main(String[] args) {
        
        int[] arr = {5, 10, 10, 10, 20, 30, 30, 40};           // Sorted array for binary search
        int key = 10;
        int firstIndex = firstOccurrence(arr, key);
        int lastIndex = lastOccurrence(arr, key);

        if (firstIndex == -1) {
            System.out.println("Value not found in the array.");
        } 

        else {
            System.out.println("First occurrence of value " + key + " is at index: " + firstIndex);
            System.out.println("Last occurrence of value " + key + " is at index: " + lastIndex);
        }
    }
}
