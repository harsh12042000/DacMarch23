class Pyramid7 {
	public static void main(String args[]) {
		
		/* 
		    * * * * * * * * *
			 * * * * * * * *   
              * * * * * * *
               * * * * * *
                * * * * *
                 * * * *
                  * * *
                   * *
                    *				   
		*/ 
		
		int n = 9;
		
		for(int i=0;i<n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=n-i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
	}
}