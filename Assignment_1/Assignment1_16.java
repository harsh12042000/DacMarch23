/*
 Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.
 */
public class Assignment1_16 {
    public static void main(String[] args) {
        
        int n = 10;
        System.out.println("int value into String : " + Integer.toString(n));

        Integer nObj = new Integer(n);
        System.out.println("int value into Integer instance : " + nObj);

        Integer i = new Integer(new String("505"));
        System.out.println("String instance into Integer instance : " + i);
        
        System.out.println("int value into binary : " + Integer.toBinaryString(n));
        System.out.println("int value into octal : " + Integer.toOctalString(n));
        System.out.println("int value into hexadecimal string : " + Integer.toHexString(n));
    }
}
