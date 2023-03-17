import java.util.Scanner;
class PositiveNegative {
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("Number is Positive");
		} else if(num < 0){
			System.out.println("Number is Negative");
		} else {
			System.out.println("Number is 0");
		}
		
	}
}