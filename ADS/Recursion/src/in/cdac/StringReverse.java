package in.cdac;

public class StringReverse {
	
	public static void rev(String str, int n) {
		if(n == 0) {
			return;
		}
		System.out.print(str.charAt(n-1));
		rev(str, n-1);
	}

	public static void main(String[] args) {
		
		String s = "harshada";
		int len = s.length();
		rev(s, len);
	}

}
