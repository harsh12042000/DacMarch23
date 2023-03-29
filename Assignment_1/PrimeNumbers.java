import java.util.Scanner;
class PrimeNumbers {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int counter = 0;
		
		System.out.println("Prime Number Series upto n: ");
		for(int i=1;i<=n;i++) {
			counter = 0;
			for(int j=i;j>=1;j--) {
				if(i%j == 0) {
					counter++;
				}
			}
			if(counter == 2) {
				System.out.println(i);
			}
		}
		
	}

}