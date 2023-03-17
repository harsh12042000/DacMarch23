class HollowFullPyramid_1 {
	public static void main(String args[]) {
		
		int n = 14;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=i; j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++) {
				
				if(j==1 || j==i*2-1 || (i==n && j%2==1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
	}
}