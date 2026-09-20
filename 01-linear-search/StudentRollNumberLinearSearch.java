// Linear Search for Student Roll Numbers   

public class Student_Roll_Number_Linear_Search {

    static int linearSearch(int arr[], int key){

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                return i; // If the key is found, return the index
            }
        }

        return -1; // If the key is not found, return -1
    }

    public static void main(String[] args) {
        
        int[] rolls = {101, 205, 309, 412, 560, 678};
        int rollToSearch = 412;
        int result = linearSearch(rolls, rollToSearch);

        if (result == -1) {
            System.out.println("Roll number " + rollToSearch + " not found.");
        } 
        
        else {
            System.out.println("Roll number " + rollToSearch + " found at index: " + result);
        }
    }
}


