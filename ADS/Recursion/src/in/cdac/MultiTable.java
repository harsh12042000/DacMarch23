package in.cdac;

public class MultiTable {

	public static void table(int n, int i) {
		if(i == 11) 
			return;
		System.out.println(n + "*" + i + " = " + n*i);
		table(n, i+1);
	}
	
	public static void main(String[] args) {
		
		int n = 8;
		table(n, 1);
	}

}
