/*
Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal 
string(Note: Here you can use doubleToLongBits() method 
along with methods of Long class).
 */
public class Assignment1_28 {
    public static void main(String[] args) {
        
        double s = 1001.1521;
        String str = Double.toString(s);
        System.out.println("Double to String: " + str);

        Double sObj = new Double(s);
        System.out.println("Double to Double instance: " + sObj);

        String str2 = "20022.145";
        Double sObj2 = new Double(Double.valueOf(str2));
        System.out.println("String to Double instance: " + sObj2);

    }
}
