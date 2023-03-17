class Pyramid4 {
	public static void main(String args[]) {
		
		/* 
		    
			                1
			              1 2 1
			            1 2 3 2 1
			          1 2 3 4 3 2 1
			        1 2 3 4 5 4 3 2 1
			      1 2 3 4 5 6 5 4 3 2 1
			    1 2 3 4 5 6 7 6 5 4 3 2 1
			  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
			1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
		*/ 
		
		int n = 9;
		
		for(int i=0;i<n;i++) {
			
			
			for(int j=1;j<(2*(n-i));j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			
			for(int j=i+1;j>=1;j--) {
				System.out.print(j + " ");
			}
			
			System.out.println();
			
		}
		
	}
}