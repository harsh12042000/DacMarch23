class Pyramid2 {
	public static void main(String args[]) {
		
		/* 
		            1
		           1 2
				  1 2 3
				 1 2 3 4
				1 2 3 4 5
			   1 2 3 4 5 6
		*/ 
		
		int n = 6;
		
		for(int i=1;i<=n;i++) {
		
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
	}
}