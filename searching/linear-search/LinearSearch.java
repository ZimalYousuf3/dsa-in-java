public class LinearSearch {
	
	static int linearSearch(int[]a, int key) {
    
		for(int i = 0; i<a.length; i++) {
      
			if(a[i] == key) {
				return i;         // found it - stop here
			}
		}
		return -1;                // Checked every thing not present
	}

	public static void main(String[] args) {
		
		int [] marks = {45, 12, 78, 33, 9, 60, 21} ;  // Unsorted Array
		
		int index = linearSearch(marks, 60);
		
		if (index != -1) {
			System.out.println("60 found at index " + index);
		}
		else {
			System.out.println("60 not found ");
		}
		
		System.out.println("Search 100 -> " + linearSearch(marks, 100));
		
	}

}
