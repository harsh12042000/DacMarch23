class Patterns10 {
	public static void main(String args[]) {
		
		/*   
				E
		       E D
			  E D C
		     E D C B
			E D C B A
		*/
		int n = 5, alphabet = 64;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=i;j>=1;j--) {
				System.out.print((char)(alphabet+n-j+1) + " ");
			}
			
			System.out.println();
		}
	}
}