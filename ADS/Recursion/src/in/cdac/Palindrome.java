package in.cdac;

public class Palindrome {

	public static int palindrome(int n, int rev) {
		if(n == 0)
			return rev;
		
		rev = (rev*10) +(n % 10);
		return palindrome(n/10, rev);
	}
	
	public static void main(String[] args) {
		
		int n = 121;
		int temp = 0;
		int rev = palindrome(n, temp);
		if(rev == n) 
			System.out.println("Palindrome");
	}

}