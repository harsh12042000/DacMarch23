class InvertedPyramid7 {
	public static void main(String args[]) {
		
		/* 
		    9 9 9 9 9 9 9 9 9 
             8 8 8 8 8 8 8 8
              7 7 7 7 7 7 7		
               6 6 6 6 6 6
                5 5 5 5 5
                 4 4 4 4
                  3 3 3
                   2 2
                    1				   
		*/ 
		
		int n = 9;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=n-i;j++) {
				System.out.print(n-i+1 + " ");
			}
			
			System.out.println();
			
		}
		
	}
}