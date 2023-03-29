/*
Write a program to find minimum and maximum number as well as 
to add two float numbers using methods of Float.

 */
public class Assignment1_26 {
    public static void main(String[] args) {
     
        float a = 23.25f;
        float b = 66.12f;

        System.out.println("Minimum Number : " + Float.min(a, b));
        System.out.println("Maximum Number : " + Float.max(a, b));
        System.out.println("Addition : " + Float.sum(a, b));
        
    }
}
