import java.util.Scanner;
class LCMbyPrimeFactors {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number1:");
		int num1 = sc.nextInt();
		System.out.print("Enter a Number2:");
		int num2 = sc.nextInt();
		
		int min = num1 < num2 ? num1 : num2;
		int lcm = 1;
		
		for(int i=2;i<=min/2;i++) {
			while(num1%i == 0 && num2%i == 0) {
				lcm = lcm*i;
				num1 = num1/i;
				num2 = num2/i;
			}
		}
		
		lcm = lcm * num1 *num2;
		
		System.out.println("LCM is: " + lcm);
	}
}