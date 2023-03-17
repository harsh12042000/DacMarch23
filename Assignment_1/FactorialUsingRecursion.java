import java.util.Scanner;
class FactorialUsingRecursion {
	
	// Using Recursion
	public static int factorial(int n) {
		
		int fact = 1;
		
		if(n >= 1) {
			return n*(factorial(n-1));
		} else {
			return 1;
		}
		
	}	
	
	public static void main(String args[]) {
		
		System.out.print("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.print("Factorial is: " + factorial(num));
	}
}