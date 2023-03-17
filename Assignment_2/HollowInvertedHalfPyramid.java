class HollowInvertedHalfPyramid {
	public static void main(String args[]) {
		
		/* 
			* * * * * *
			*       *
			*     *
			*   *
			* *
			*
			
		*/ 
		
		int n = 6;
		
		for(int i=n;i>=1;i--) {
			
			for(int j=1;j<=n;j++) {
				
				if(i==n || j==1 || i==j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
			
		}
		
	}
}