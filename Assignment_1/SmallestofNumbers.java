import java.util.Scanner;
class SmallestofNumbers {
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1:");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2:");
		int num2 = sc.nextInt();
		System.out.print("Enter number 3:");
		int num3 = sc.nextInt();
		
		if(num1 < num2 && num1 < num3) {
			System.out.println("Number 1 is Smallest.");
		} else if(num2 < num3) {
			System.out.println("Number 2 is Smallest.");
		} else {
			System.out.println("Number 3 is Smallest.");
		}
	}
}