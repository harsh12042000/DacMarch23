/*
Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.
 */
public class Assignment1_24 {
    public static void main(String[] args) {

        float f = 77.8f;
        System.out.println("float value into String : " + Float.toString(f));

        Float f1 = new Float(f);
        System.out.println("float value into float instance : " + f1);

        String s = new String("2254");
        Float f2 = new Float(s);
        System.out.println("String instance into float instance : " + f2);

        System.out.println("float into hexadecimal string : " + Float.toHexString(f));

    }
}
