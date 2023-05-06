package in.cdac;

// x raised to n (Stack height = n)
public class XraisedN {
	
	public static int cal(int x, int n) {
		
		if(n == 0) 
			return 1;
		
		int xPown = x * cal(x, n-1);
		return xPown;
	}

	public static void main(String[] args) {
		
		int x = 2, n = 5;
		System.out.println(cal(x, n));
	}

}
