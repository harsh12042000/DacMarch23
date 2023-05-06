package in.cdac;

public class TowerofHanoi {

	public static void towerofHanoi(int n, String src, String helper, String dest) {
		
		System.out.println(n + " " + src + " " + helper + " " + dest);
		if(n == 1) {
			System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
			return;
		}
//		System.out.println(n);
		towerofHanoi(n-1 , src, dest, helper);
		System.out.println("*Transfer disk " + n + " from " + src + " to " + dest);
		towerofHanoi(n-1, helper, src, dest);
	}
	
	public static void main(String[] args) {
		
		int n = 3;
		towerofHanoi(n, "S", "H", "D");
	}

}