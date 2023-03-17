import java.util.Scanner;
class SumofDigits {
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int num = sc.nextInt();
		
		int arr[] = new int[50];
		int i=0,rem,sum=0,count=0;
		
		while(num > 0) {
			
			rem = num % 10;
			arr[i] = rem;
			num = num/10;
			i++;
			count++;
		}
		
		for(int j=0;j<count;j++) {
			sum = sum + arr[j];
		}
		
		System.out.println("Sum of digits is: " + sum);
		
	}
}