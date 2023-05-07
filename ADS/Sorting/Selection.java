public class Selection {
	
	public static void sort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		Selection.display(arr);
	}
	
	public static void display(int[] arr) {
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
	
	public static void main(String args[]) {
		int[] arr = new int[]{10, 89, 45, 12, 80, 91};
		Selection.sort(arr);
	}
}