import java.util.Scanner;
class Factors {
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int num = sc.nextInt();
		int count=0;
		
		System.out.println("Factors are:");
		
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				System.out.println(i);
			}
		}
		
	}
}