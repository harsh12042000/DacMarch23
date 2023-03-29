// Write a program to convert state of Byte instance into byte, 
// short, int. long, float and double.

public class Assignment1_09 {
    public static void main(String args[]) {

        Byte b = new Byte((byte)10);
        byte b1 = b.byteValue();
        short s = b.shortValue();
        int i = b.intValue();
        long l = b.longValue();
        float f = b.floatValue();
        double d = b.doubleValue();

        System.out.println(b1);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}