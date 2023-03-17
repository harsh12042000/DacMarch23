import java.util.Scanner;
class AddTwoNumbers {
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1:");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2:");
		int num2 = sc.nextInt();
		
		for(int i=1;i<=num2;i++) {
			num1++;
		}
		
		System.out.println("Addition of Numbers is: " + num1);
	}
}