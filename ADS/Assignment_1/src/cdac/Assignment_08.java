package cdac;

//How do you find pair whose sum is closest to zero in an array in Java
public class Assignment_08 {
	
	private static void findSumNearZero(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-1;j++) {
				if(arr[i] + arr[j] == 1 || arr[i] + arr[j] == -1 || arr[i] + arr[j] == 0)
					System.out.println("(" + arr[i] + ", " + arr[j] + ")");
			}
		}
	}

	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 2, 0, -3, -1, 1};
		findSumNearZero(arr);
	}
}
