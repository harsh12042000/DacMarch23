import java.util.Scanner;

class RationalNumber {
	private int num1;
	private int num2;
	private int den1;
	private int den2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getDen1() {
		return den1;
	}
	public void setDen1(int den1) {
		this.den1 = den1;
	}
	public int getDen2() {
		return den2;
	}
	public void setDen2(int den2) {
		this.den2 = den2;
	}
	void finalResult(int numResult, int denResult) {
		int gcd = 1;
		int count = numResult < denResult ? numResult : denResult;
		for(int i=2;i<=count;i++) {
			if(numResult%i == 0 && denResult%i == 0) {
				gcd = i;
			}
		}
		System.out.println("Result : " + numResult/gcd + "/" + denResult/gcd);
	}
}

public class Assignment_08 {
		
	static Scanner sc = new Scanner(System.in);

    static int operations() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
        System.out.print("Enter choice :");
        int choice = sc.nextInt();
        return choice;
    }
	    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        RationalNumber rn = new RationalNumber();

        System.out.print("Enter first Rational Number : \nNumerator: ");
        rn.setNum1(sc.nextInt());
        System.out.print("Denominator: ");
        rn.setNum2(sc.nextInt());
        System.out.print("Enter second Rational Number : \nNumerator: ");
        rn.setDen1(sc.nextInt());
        System.out.print("Denominator: ");
        rn.setDen2(sc.nextInt());

        int choice = 0;
        int num1 = rn.getNum1();
        int num2 = rn.getNum2();
        int den1 = rn.getDen1();
        int den2 = rn.getDen2();
        
        int numResult = 0;
		int denResult = 0;
		
        while((choice = Assignment2_08.operations()) != 0) {
            switch(choice) {
                case 1:
                		numResult = (num1 * den2) + (num2 * den1);
                		denResult = den1 * den2;
                		rn.finalResult(numResult, denResult);
                        break;

                case 2:
	                	numResult = (num1 * den2) - (num2 * den1);
	            		denResult = den1 * den2;
	            		rn.finalResult(numResult, denResult);
                        break;

                case 3:
		            	numResult = num1 * num2;
		        		denResult = den1 * den2;
		        		rn.finalResult(numResult, denResult);
		                break;

                case 4:
	                	numResult = num1 * den2;
	            		denResult = den1 * num2;
	            		rn.finalResult(numResult, denResult);
	                    break;
            }
        }
    }    
}
