package cdac;

//How do you find the missing number in a given integer array of 1 to 100?
public class Assignment_01 {

	private static void missingNumber(int[] arr, int n) {
		
		int temp[] = new int[n+1];
		
		for(int i=0;i<n;i++) {
			if(arr[i] != 0) {
				temp[arr[i]-1] = 1;	
			}
		}
		
		for(int i=0;i<n;i++) {
			if(temp[i] == 0 || arr[i]==0)
				System.out.println(i + " is missing");
		}
		
	}
	
	public static void main(String[] args) {
		
//		int arr[] = new int[] {1, 5, 8, 3, 2, 6, 7};
		
		int arr[] = new int[100];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		arr[26] = 30;
		
		missingNumber(arr, arr.length);
	}
}
