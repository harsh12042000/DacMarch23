class Patterns2 {
	public static void main(String args[]) {
		
		/*
		A
		A B
		A B C
		A B C D
		A B C D E
		*/
		int alphabet = 65;
		
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				
				System.out.print((char)(alphabet + j) + " ");
			}
			System.out.println();
		}
	}
}