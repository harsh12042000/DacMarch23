import java.util.Scanner;
class Odd {
	public static void main(String arg[]) {
		
		System.out.println("Enter Number upto which to print Odd Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Odd Numbers are:");
		for(int i=1;i<=n;i=i+2) {
			System.out.println(i);
		}
	}
}