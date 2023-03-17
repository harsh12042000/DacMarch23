class Patterns8 {
	public static void main(String args[]) {
		
		/*
		    5
		   4 5 
		  3 4 5
		 2 3 4 5   
		1 2 3 4 5
		*/
		int n = 5;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=i;j>=1;j--) {
				System.out.print(n-j+1 + " ");
			}
			
			System.out.println();
		}
	}
}