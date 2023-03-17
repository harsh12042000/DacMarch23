class Patterns7 {
	public static void main(String args[]) {
		
		/*
		    1     4space
		   1 2    3
		  1 2 3   2
		 1 2 3 4  1
		1 2 3 4 5 0
		
		*/
		int n = 5;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
}