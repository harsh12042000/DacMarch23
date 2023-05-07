public class Insertion {
	
	public static void sort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            
            for (int k = 0; k<arr.length; k++) {
                System.out.print(arr[k] + " ");
            } 
            System.out.println();
        }
		Insertion.display(arr);
	}
	
	public static void display(int[] arr) {
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
	
	public static void main(String args[]) {
		int[] arr = new int[]{10, 89, 45, 12, 80, 91};
		Insertion.sort(arr);
	}
}