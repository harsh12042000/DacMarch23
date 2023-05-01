package cdac;

//How do you search for an element in row-wise and column-wise sorted matrix
public class Assignment_11 {
	
	private static void findElement(int[][] arr, int value) {
		
		int row = 0;
		int col = arr.length-1;
		
		while(row < arr.length && col >= 0) {
			if(arr[row][col] == value) {
				System.out.println(value + " Found at " + "[" + row + "]" + "[" + col + "]");
				break;
			} else if(arr[row][col] < value) 
				row++;
			else
				col--;
		}
		return;
	}
	
	public static void main(String[] args) {
		
		int[][] arr = new int[][] {{1, 6, 12, 24}, {2, 7, 13, 25}, {3, 8, 14, 26}, {4, 9, 15, 27}};
		findElement(arr, 12);
	}

}
