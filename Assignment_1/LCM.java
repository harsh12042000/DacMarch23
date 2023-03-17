import java.util.Scanner;
class LCM {
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1:");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2:");
		int num2 = sc.nextInt();
		
		int lcm;
		
		if(num1 > num2) {
			lcm = num1;
		} else {
			lcm = num2;
		}
		
		while(true) {
			if(lcm%num1 == 0 && lcm%num2 == 0) {
				System.out.println("LCM is: " + lcm);
				break;
			}
			++lcm;
		}
	}
}