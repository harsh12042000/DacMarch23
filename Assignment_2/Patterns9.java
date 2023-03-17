class Patterns9 {
	public static void main(String args[]) {
		
		/*
		        A
		       A B
			  A B C
			 A B C D
			A B C D E
		*/
		int n = 5, alphabet = 64;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print((char)(alphabet+j) + " ");
			}
			
			System.out.println();
		}
	}
}