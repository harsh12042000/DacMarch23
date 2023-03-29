import java.util.Scanner;
class Palindrome {
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		int r,sum=0,temp;    
		temp = num; 
		
		while(num>0){    
			r=num%10;  
			sum=(sum*10)+r;    
			num=num/10;    
		}
		
		if(temp==sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");  
	}
}