public class BinarySearch {
	
	public static int search(int[] arr, int value) {

		int start = 0;
		int end = arr.length - 1;
		int mid = (start+end)/2;
		
		while(start < end) {

			if(arr[mid] == value) {
				return mid;
			}
			
			if(value > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			
			mid = (start + end)/2;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		
		int arr[] = new int[]{10, 20, 25, 55, 85, 96, 100};
		System.out.println("Found at : " + BinarySearch.search(arr, 96));
	}
}