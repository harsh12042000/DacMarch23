package in.cdac;

public class Series01 {

	public static void series(int n, int i, double sum) {
		
		if(i > n) {
			System.out.println(sum);
			return;
		}
		
		double term = 1.0 / i;
        if (i % 2 == 0) {
            sum -= term;
        } else {
            sum += term;
        }
        
        series(n,i+1,sum);
		
	}
	
	public static void main(String[] args) {
		
		int n = 4;
		series(n, 1, 0);
	}

}