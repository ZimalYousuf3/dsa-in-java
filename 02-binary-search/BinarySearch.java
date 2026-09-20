// Binary Search Algorithm in Java

public class BinarySearch {

    static int binarySearch(int[] arr, int key) {

        int low = 0 ;
        int high = arr.length - 1;

        for (int i = 0 ; low <= high ; i++) {

            int mid  = low + (high - low) / 2 ;

            if (arr[mid] == key) {
                return mid;             // key found at index mid
            }

            else if (arr[mid] < key) {
                low = mid + 1 ;         // key is in the upper half. Go to the right side of mid
            }

            else {
                high = mid - 1 ;        // key is in the lower half. Go to the left side of mid
            }
        }

        return -1 ;                     // key not found
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50, 60, 70};     // Sorted array for binary search
        int key = 50;
        int index = binarySearch(arr, key);

        if (index == -1) {
            System.out.println("Not Found");                       // key not found in the array
        } 

        else {
            System.out.println("Value found at index: " + index);  // key found at index
        }
    }
}
