class Patterns15 {
	public static void main(String args[]) {
		
		/*   
		   5 4 3 2 1
		   5 4 3 2
		   5 4 3
		   5 4
		   5
		*/ 
		int n = 5;
		for(int i=0;i<=n;i++) {
			
			for(int j=n;j>=i+1;j--) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
}