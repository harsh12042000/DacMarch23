/*
Write a program to accept and print full name as an argument 
from command line.
 */
public class Assignment1_32 {
    public static void main(String[] args) {
        
        if(args.length == 0) {
            System.out.println("Enter your full name as Command Line Arguement");
        }

        for(int i=0;i<args.length;i++) {
            System.out.print(args[i] + " ");
        }

    }
}
