package cdac;

//How do you find all pairs of an integer array whose sum is equal to a given number?
public class Assignment_07 {
	
	private static void findPairs(int[] arr, int n) {
		for (int i=0; i<arr.length; i++) {
	        for (int j=i+1; j<arr.length; j++) {
	            if(arr[i] + arr[j] == n) {
	                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		
		int[] arr = new int[] {3, 10, 5, 4, 6, 1, 8, 2, 7};
		int n = 9;
		findPairs(arr, n);
	}
}
