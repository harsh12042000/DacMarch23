import java.util.Scanner;
class PrintNumbers {
	
	// Print 1 to 10 without using loop
	public static void num(int from) {
		
		if(from <= 10) {
			System.out.println(from);
			num((from+1));
		}
	}
	
	public static void main(String arg[]) {
		
		int from = 1;
		num(from);
		
	}
}

