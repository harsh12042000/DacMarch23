/*
Pass integer, float and double value from command line. Parse 
it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case
 */
import java.util.Scanner;
public class Assignment1_33 {
    public static void main(String[] args) {

        if(args.length == 0) {
            System.out.println("Enter Integer, Float, Double from Command Line Arguement");
            return;
        }

        int ch = 0;
        int a = Integer.parseInt(args[0]);
        float b = Float.parseFloat(args[1]);
        Double c = Double.parseDouble(args[2]);

        do {

            System.out.println("Enter Your Choicee : 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Exit");

            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

            switch(ch) {
                
                case 1 :System.out.println("Addition is : " + (double)(a+b+c));
                        break;
                    
                case 2 :System.out.println("Subtraction is : " + (double)(a-b-c));
                        break;

                case 3 :System.out.println("Multiplication is : " + (double)(a*b*c));
                        break;

                case 4 :System.out.println("Division is : " + (double)(a/b/c));
                        break;
            }

        } while(ch!=5);

    }
}
