package in.cdac;

public class SeriesofNumbers {
	
	public static void series(int n) {
		if(n == 0)
			return;
		series(n-1); //Head Recursion
		System.out.println(n);
//		series(n-1); //Tail Recursion
	}

	public static void main(String[] args) {
		
		int n = 10;
		series(n);		
	}

}
