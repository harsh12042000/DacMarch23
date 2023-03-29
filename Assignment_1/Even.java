import java.util.Scanner;
class Even {
	public static void main(String arg[]) {
		
		System.out.println("Enter Number upto which to print Even Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Even Numbers are:");
		for(int i=0;i<=n;i=i+2) {
			System.out.println(i);
		}
		
	}
}