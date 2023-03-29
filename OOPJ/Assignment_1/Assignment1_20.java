/*
Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.

 */
public class Assignment1_20 {
    public static void main(String[] args) {
        
        long l = 852222221;
        System.out.println("long value into String : " + Long.toString(l));
        Long l1 = new Long(l);
        System.out.println("long value into long instance : " + l1);

        System.out.println("long value into binary : " + Long.toBinaryString(l));
        System.out.println("long value into octal : " + Long.toOctalString(l));
        System.out.println("long value into hexadecimal : " + Long.toHexString(l));

    }

}
