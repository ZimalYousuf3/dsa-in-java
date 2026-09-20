// Count Frequency + Position Tracking

public class CountFrequency {
	
	static void linearSearch(int[]a, int key) {
		
		int []indices = new int[a.length] ;
		int count = 0 ;
		
		
		for(int i = 0; i<a.length; i++) {
			
			if(a[i] == key) {
				indices[count] = i ;
				count++;
			}
		}
		
		if (count > 0) {
			System.out.println("Value found "+ count + " times at indices: ");
			
			for (int i = 0; i<count; i++) {
				System.out.println(indices[i] + " ");
			}
		}
		else {
			System.out.println("Value not found");
		}
	}

	public static void main(String[] args) {
		int [] arr = {2, 4, 2, 6, 2, 8, 2} ;  // Unsorted Array
		
		linearSearch(arr, 2);
	}

}
