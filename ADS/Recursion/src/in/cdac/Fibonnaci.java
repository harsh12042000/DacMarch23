package in.cdac;

public class Fibonnaci {
	
	public static void fibo(int a, int b, int n) {
		
		if(n == 0)
			return;
		
		System.out.print(a+b + " ");
		fibo(b, a+b, n-1);
	}

	public static void main(String[] args) {

		int a=0;
		int b=1;
		System.out.print(a + " " + b);
		fibo(a, b, 10-2);
	}

}