package cdac;

//How do you find the second-largest number in the array?
public class Assignment_03 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 50, 55};
		
		Assignment_03.secondMax(arr);
	}

	private static void secondMax(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		int max2 = arr[0];
		for(int i=1;i<arr.length;i++) {
			
			if(max2 < arr[i] && arr[i] != max) {
				max2 = arr[i];
			}
		}
		System.out.println("Second largest element is : " + max2);
	}

}
