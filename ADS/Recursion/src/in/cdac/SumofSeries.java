package in.cdac;

public class SumofSeries {

	public static void sum(int i, int n, int sum) {
	
		if(i == n) {
			System.out.println(sum);
			return;
		}
		sum = sum + i;
		sum(i+1, n, sum);
	}
	
	public static void main(String[] args) {
		
		sum(1, 5, 0);
	}

}
