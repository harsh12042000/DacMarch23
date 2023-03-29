/*
Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.
 */
public class Assignment1_13 {

    public static void main(String args[]) {
        
        short s = 100;
        String str = Short.toString(s);
        System.out.println("Short to String: " + str);

        Short sObj = new Short(s);
        System.out.println("Short to Short instance: " + sObj);

        String str2 = "200";
        Short sObj2 = new Short(Short.valueOf(str2));
        System.out.println("String to Short instance: " + sObj2);
    }

}
