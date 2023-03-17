import java.util.Scanner;
class Factors {
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int num = sc.nextInt();
		
		int arr[] = new int[50];
		int j=0, count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				arr[j] = i;
				count++;
				j++;
			}
		}
		System.out.println("Factors are:");
		
		for(int k=0;k<count;k++) {
			System.out.println(arr[k]);
		}
	}
}