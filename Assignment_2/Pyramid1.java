class Pyramid1 {
	public static void main(String args[]) {
		
		/* 
		            1
		           2 2
		          3 3 3
				 4 4 4 4
				5 5 5 5 5 
		       6 6 6 6 6 6
			  7 7 7 7 7 7 7 
			 8 8 8 8 8 8 8 8
			9 9 9 9 9 9 9 9 9 
		*/ 
		
		int n = 9;
		
		for(int i=1;i<=n;i++) {
		
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
		}
		
	}
}