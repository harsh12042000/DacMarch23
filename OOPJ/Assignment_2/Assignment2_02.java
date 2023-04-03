import java.util.Scanner;

/*
You have been asked to write a Java program to implement a BMI (Body Mass
Index) calculator. The program should have the following functionality:
The BMI calculator class should have the following fields:
a. height: A double field to store the height of the person in meters.
b. weight: A double field to store the weight of the person in kilograms.
The BMI calculator class should have the following methods:
a. A constructor to initialize the height and weight fields of the BMI calculator
object.
b. Getter and setter methods.
c. Double calculateBMI(): A method to calculate the BMI of the person using the
following formula:
BMI = weight / (height * height).
Write a Java program that creates an object of the BMI calculator class, prompts the
user to input their height and weight, sets the height and weight fields of the BMI
calculator object using the setter methods, calculates the BMI using the
calculateBMI() method, and prints the calculated BMI to the console.
 */
class BMI {
    private double height;
    private double weight;
    BMI() {
        this.height = 0;
        this.weight = 0;
    }
    void setHeight(double height) {
        this.height = height;
    }
    void setWeight(double weight) {
        this.weight = weight;
    }
    double getHeight() {
        return this.height;
    }
    double getWeight() {
        return this.weight;
    }
    double calculateBMI(double height, double weight) {
        return (weight / (height * height));
    }
}

class Assignment2_02 {    
    public static void main(String args[]) {

        BMI b = new BMI();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height (m): ");
        double height = sc.nextDouble();
        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();
        sc.close();

        b.setHeight(height);
        b.setWeight(weight);
        double BMI = b.calculateBMI(b.getHeight(),b.getWeight());
        System.out.printf("BMI is %.3f" , BMI);
    }
}