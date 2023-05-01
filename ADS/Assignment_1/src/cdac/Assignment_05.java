package cdac;

//How do you find the largest and smallest number in an unsorted integer array?
public class Assignment_05 {

	private static void maxMin(int[] arr) {
		
		int max = arr[0], min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] < min)
				min = arr[i];
			
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("Max : " + max + ", Min : " + min);
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 52, 96, 18, 33, 66, 11, 57, 54, 19};
		maxMin(arr);	
	}
}
