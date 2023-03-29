import java.util.Scanner;
class Factorial {	

	public static int factorial(int n) {
		
		int fact = 1;
		for(int i=n;i>=1;i--) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String args[]) {
		
		System.out.print("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.print("Factorial is: " + factorial(num));
	}
}