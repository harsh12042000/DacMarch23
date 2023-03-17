class HollowFullPyramid {
	public static void main(String args[]) {
		
		/* 
		         *
		        * *
			   *   *
			  *     *
			 *       *
			* * * * * *
			
		*/ 
		
		int n = 15;
		
		for(int i=1;i<n;i++) {
		
			for(int j=i;j<=n-1;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=n-1;j++) {
				if(i == j) {
					System.out.print("*");
				} 
			}
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<i-1;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<i;j++) {
				if(j==i-1)
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			System.out.print("* ");
		}
		
	}
}