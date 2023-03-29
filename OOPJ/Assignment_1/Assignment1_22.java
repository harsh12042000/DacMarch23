/*
 Write a program to find minimum and maximum number as well as 
to add two long numbers using methods of Long.
 */
public class Assignment1_22 {
    public static void main(String[] args) {
        
        long a = 555555555;
        long b = 2222222;

        System.out.println("Minimum Number : " + Long.min(a, b));
        System.out.println("Maximum Number : " + Long.max(a, b));
        System.out.println("Addition : " + Long.sum(a, b));
    }
}
