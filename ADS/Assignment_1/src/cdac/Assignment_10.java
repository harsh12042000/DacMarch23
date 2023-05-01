package cdac;

//How are duplicates removed from a given array in Java?
public class Assignment_10 {

	private static void removeDuplicate(int[] arr) {
		
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n-1;j++) {
				if(arr[i] == arr[j]) {
					while(j < n-1) {
						arr[j] = arr[j+1];
						j++;
					}
					n--;
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {10, 52, 66, 10, 33, 8, 11, 57};
		removeDuplicate(arr);
	}
}
