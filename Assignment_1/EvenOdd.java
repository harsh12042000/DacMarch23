import java.util.Scanner;
class EvenOdd {
	public static void main(String args[]) {
		
		System.out.print("Enter a number to check Even or Odd:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("The given number is Even.");
		} else {
			System.out.println("The given number is Odd.");
		}
			
	}
}