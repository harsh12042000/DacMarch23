public class Recursive {
	
	public static int recursive(int[] arr, int start, int end, int value) {
		if(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] == value)
				return mid;
			
			if(arr[mid] > value)
				return recursive(arr, start, mid - 1, value);
			
			return recursive(arr, mid + 1, end, value);
		}
		return -1;
	}
	
	public static void main(String args[]) {
		
		int arr[] = new int[]{10, 20, 25, 55, 85, 96, 100};
		
		System.out.print("Element is present at index : " + recursive(arr, 0, arr.length-1, 57));
	}
}