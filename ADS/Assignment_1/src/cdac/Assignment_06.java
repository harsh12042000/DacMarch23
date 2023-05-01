package cdac;

//How do you find a number occurring the odd number of times in an array?
public class Assignment_06 {
	
	private static void oddCount(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 != 0)
				count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 52, 96, 13, 33, 66, 11, 57, 54, 19};
		oddCount(arr);
	}

}
