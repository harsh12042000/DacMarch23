package cdac;

public class Assignment_09 {

	private static void findDuplicate(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i] == arr[j])
					System.out.println(arr[i] + " is duplicate");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 52, 66, 10, 33, 66, 11, 57};
		findDuplicate(arr);
	}

}
