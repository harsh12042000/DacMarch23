import java.util.Scanner;

/*
You are required to write a Java program to perform arithmetic operations on rational
numbers. Rational numbers are numbers that can be expressed as a fraction of two
integers (i.e., numerator and denominator). The program should take the following
inputs from the user:
Two rational numbers (i.e., two pairs of integers representing the numerator and
denominator of each number)
The program should then perform the arithmetic operation on the two rational
numbers and output the result in the form of a reduced fraction (i.e., the numerator
and denominator should be as small as possible).
Example Input
Enter the first rational number:
Numerator: 2
Denominator: 3
Enter the second rational number:
Numerator: 1
Denominator: 6
Enter the arithmetic operation (+, -, *, /): *
 */
class RationalNumbers {

    double firstNumerator;
    double secondNumerator;
    double firstDenominator;
    double secondDenominator;

    RationalNumbers(){
        firstDenominator = 1;
        secondDenominator = 1;
    }

    double addition() {
        double addition = ((firstNumerator * secondDenominator) + (secondNumerator * firstDenominator)) / (firstDenominator * secondDenominator);
        return addition;
    }

    double subtraction() {
        double addition = ((firstNumerator * secondDenominator) - (secondNumerator * firstDenominator)) / (firstDenominator * secondDenominator);
        return addition;
    }

    double multiplication() {
        double multiplication = (firstNumerator * secondNumerator) / (firstDenominator * secondDenominator);
        return multiplication;
    }

    double division() {
        double division = (firstNumerator * secondDenominator) / (secondNumerator * firstDenominator);
        return division;
    }
}

class Assignment2_08 {

    static Scanner sc = new Scanner(System.in);

    static int operations() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
        System.out.print("Enter choice :");
        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        RationalNumbers rn = new RationalNumbers();
        System.out.print("Enter first Rational Number : \nNumerator: ");
        rn.firstNumerator = sc.nextDouble();
        System.out.print("Denominator: ");
        rn.firstDenominator = sc.nextDouble();
        System.out.print("Enter second Rational Number : \nNumerator: ");
        rn.secondNumerator = sc.nextDouble();
        System.out.print("Denominator: ");
        rn.secondDenominator = sc.nextDouble();

        int choice = 0;
        while((choice = Assignment2_08.operations()) != 0) {
            switch(choice) {
                case 1:
                        System.out.println("Addition of 2 rational numbers is : " + rn.addition());
                        break;

                case 2:
                        System.out.println("Subtraction of 2 rational numbers is :" + rn.subtraction());
                        break;

                case 3:
                        System.out.println("Multiplication of 2 rational numbers is :" + rn.multiplication());
                        break;

                case 4:
                        System.out.println("Division of 2 rational numbers is :" + rn.division());
                        break;
            }
        }
    }    
}