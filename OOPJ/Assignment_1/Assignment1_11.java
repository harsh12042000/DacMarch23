/*
Accept character from command line and perform below 
operations. Here you can use charAt() method to extract 
character:
a. Check whether entered character is letter or digit. If it 
is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? 
If it is in lowercase then convert it into upper case and 
print it well as its code point. If it is in uppercase 
then convert it into lower case and print it well as its 
code point.
 */

public class Assignment1_11 {

    public static void main(String args[]) {

        if(args.length == 0) {
            System.out.println("Enter Character as Command Line Argument");
            return;
        }

        char c = args[0].charAt(0);
        if(Character.isLetter(c)) {
            System.out.println(c + " is a letter.");

            if(Character.isLowerCase(c)) {
                char s = Character.toUpperCase(c);
                int codePoint = c;
                System.out.println("After converting lowercase to uppercase : " + s);
                System.out.println("Its code point is: " + codePoint);
            } else {
                char s = Character.toLowerCase(c);
                int codePoint = c;
                System.out.println("After converting uppercase to lowercase : " + s);
                System.out.println("Its code point is: " + codePoint);
            }
        } else if(Character.isDigit(c)) {
            System.out.println(c + " is a Digit.");
            int codePoint = c;
            System.out.println("Its code point is: " + codePoint);
        } else {
            System.out.println(c + " is neither a letter nor a digit.");
        }
    }
}