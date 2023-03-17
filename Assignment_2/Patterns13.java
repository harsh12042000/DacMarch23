class Patterns13 {
	public static void main(String args[]) {
		
		/*   
		        A
		       B B
			  C C C 
			 D D D D
			E E E E E
		*/ 
		int n = 5, alphabet = 64;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print((char)(alphabet+i) + " ");
			}
			
			System.out.println();
		}
	}
}