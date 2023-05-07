public class BubbleSort {
	
	public static void sort(int[] arr) {
		
		int temp = 0;
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}				
		}
		
		BubbleSort.display(arr);
	}
	
	public static void sortOptimized(int[] arr) {
		
		int temp = 0;
		for(int i=0;i<arr.length-1;i++) {
			boolean flag = false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
				if(flag != true) 
					break;
			}				
		}
		
		BubbleSort.display(arr);
	}
 	
	public static void display(int[] arr) {
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
	
	public static void main(String args[]) {
		
		int[] arr = new int[]{10, 89, 45, 12, 80, 91};
		BubbleSort.sort(arr);
		
		System.out.println();
		
		int[] arr1 = new int[]{52, 25, 10, 33, 90, 45};
		BubbleSort.sortOptimized(arr1);
	}
}