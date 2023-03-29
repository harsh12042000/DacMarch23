import java.util.Scanner;
class PrimeFactors {
	
	public static void main(String args[]) {
		
		System.out.print("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int c = 2;
		
		System.out.println("Prime Factors of " + num + " are:");
		while(num > 1) {
			if(num % c == 0)  {
				System.out.println(c);
				num = num/c;
			} else {
				c++;
			}
		}
	}
}