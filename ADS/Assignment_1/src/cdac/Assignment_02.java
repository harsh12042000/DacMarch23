package cdac;

//How do you search for an element in a sorted and rotated array in Java?
public class Assignment_02 {
	
	public static void findinSorted(int[] arr, int value) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] == value) {
				System.out.println("Found at " + mid);
			}
			
			if(arr[mid] > value) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
	}
	
	public static int[] rotatedArray(int[] arr1) {
		//TODO
		return arr1;
	}

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		Assignment_02.findinSorted(arr1, 90);
		int[] arr2 = Assignment_02.rotatedArray(arr1);
		for(int a : arr2) {
			System.out.println(a);
		}
		Assignment_02.findinSorted(arr2, 90);
	}

}