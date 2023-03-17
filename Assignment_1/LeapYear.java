import java.util.Scanner;
class LeapYear {
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
			System.out.println("Year is Leap Year");
		} else {
			System.out.println("Year is not Leap Year");
		}
		
	}
}