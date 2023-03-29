/*
Read the documentation of NumberFormatException and try to 
generate it in Java code.
 */
public class Assignment1_31 {
    public static void main(String[] args) {
        
        // Thrown to indicate that the application has attempted to convert a string to one of the numeric types, but that the string does not have the appropriate format.
        String s = "25kjuasc7";
        int i = Integer.valueOf(s);
        System.out.println(i);

        /*
        Exception in thread "main" java.lang.NumberFormatException: For input string: "25kjuasc7"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65) 
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.valueOf(Integer.java:766)
        at Assignment1_31.main(Assignment1_31.java:10)
         */
    }
}
