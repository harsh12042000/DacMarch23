/*
Write a program to convert state of Double instance into byte, 
short, int, long, float and double.
 */

public class Assignment1_29 {
    public static void main(String[] args) {

        Double i = new Double(2115121.2225);

        System.out.println("byte : " + i.byteValue());
        System.out.println("short : " + i.shortValue());
        System.out.println("int : " + i.intValue());
        System.out.println("long : " + i.longValue());
        System.out.println("float : " + i.floatValue());
        System.out.println("double : " + i.doubleValue());
    }
}
