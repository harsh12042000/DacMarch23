/*
Write a program to convert state of Float instance into byte, 
short, int, long, float and double.

 */
public class Assignment1_25 {
    public static void main(String[] args) {

        Float i = new Float(25.25);

        System.out.println("byte : " + i.byteValue());
        System.out.println("short : " + i.shortValue());
        System.out.println("int : " + i.intValue());
        System.out.println("long : " + i.longValue());
        System.out.println("float : " + i.floatValue());
        System.out.println("double : " + i.doubleValue());
    }
    
}
