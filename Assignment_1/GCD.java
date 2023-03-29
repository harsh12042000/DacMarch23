import java.util.Scanner;
class GCD {
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1:");
		int num1 = sc.nextInt();
		System.out.print("Enter number 2:");
		int num2 = sc.nextInt();
		
		int i=2,hcf=1,count=1;
		
		if(num1 < num2) {
			count = num1;
		} else {
			count = num2;
		}
		
		for(i=2;i<=count;i++) {
			while(num1 % i == 0 && num2 % i == 0) {
				hcf = hcf*i;
				num1 = num1 / i;
				num2 = num2 /i;
			}
		}
		
		System.out.println("GCD is : " + hcf);
	}
}