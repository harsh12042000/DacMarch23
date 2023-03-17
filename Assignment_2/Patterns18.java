class Patterns18 {
	public static void main(String args[]) {
		
		/*   
		   A B C D E
		   A B C D
		   A B C
		   A B 
		   A
		*/ 
		int n = 5;
		char alphabet = 65;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i;j++) {
				System.out.print((char)(alphabet+j) + " ");
			}
			
			System.out.println();
		}
	}
}