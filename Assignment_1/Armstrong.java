// a number that is equal to the sum of cubes of its digits
//1, 153, 370, 371 and 407 
//153 => 1 + 125 + 27 = 153
import java.util.Scanner;
class Armstrong {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		int temp = num;
		int rem=0,sum=0;
		
		while(num != 0) {
			rem = num%10;
			sum = sum + (rem*rem*rem);
			num = num/10;
		}
		
		if(temp == sum) {
			System.out.println("Number is Armstrong Number");
		} else {
			System.out.println("Number is not Armstrong Number");
		}
		
	}
}