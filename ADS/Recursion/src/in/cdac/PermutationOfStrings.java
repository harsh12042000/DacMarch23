package in.cdac;

public class PermutationOfStrings {
	
	public static void print(String str, String ans) {
		
		if(str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			//rest of string
			String ros = str.substring(0, i) + str.substring(i+1);
			
			print(ros, ans+ch);
		}
		
	}

	public static void main(String[] args) {
		
		String s = "abc";
		print(s, "");
	}

}