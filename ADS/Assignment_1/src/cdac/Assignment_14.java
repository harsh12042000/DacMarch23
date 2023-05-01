package cdac;

public class Assignment_14 {

	public static void reverse(int[] arr) {
	    int start = 0;
	    int end = arr.length - 1;
	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i] + " ");
	    }
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		reverse(arr);
	}

}
