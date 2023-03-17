class Patterns16 {
	public static void main(String args[]) {
		
		/*   
		   5
		   5 4
		   5 4 3
		   5 4 3 2
		   5 4 3 2 1
		*/ 
		int n = 5;
		for(int i=1;i<=n;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(n-j + " ");
			}
			
			System.out.println();
		}
	}
}