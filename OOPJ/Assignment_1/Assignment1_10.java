// Write a program to perform below operations on char type to 
// get:
// a. The number of bits used to represent a char value
// b. The number of bytes used to represent a char value
// c. The minimum value a char
// d. The maximum value a char

public class Assignment1_10 {
    
    public static void main(String args[]) {

        System.out.println("The number of bits used to represent a char value : " + Character.SIZE);
        System.out.println("The number of bytes used to represent a char value : " + Character.BYTES);
        System.out.println("The minimum value a char : " + Character.MIN_VALUE);
        System.out.println("The maximum value a char : " + Character.MAX_VALUE);

    }

}
