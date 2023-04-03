import java.util.Scanner;

/*
You have been asked to write a Java program to implement a credit score calculator.
The credit score calculator class should have the following fields:
a. creditHistory: An int to represent the length of the individual's credit history.
b. creditUtilization: A double to represent the percentage of available credit the
individual is using.
c. paymentHistory: A boolean to represent whether the individual has a good
payment history or not.
The credit score calculator class should have the following methods:
a. Constructors
b. Getter and setter methods
c. int calculateCreditScore(): A method to calculate the credit score based on
the provided information. The credit score should be calculated using the
following formula:
I. If the individual has a good payment history, the credit score should
be calculated as follows:
creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55
II. If the individual has a bad payment history, the credit score should be
calculated as follows:
creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35
 */
class CreditScore {
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    CreditScore() {
        this.creditHistory = 0;
        this.creditUtilization = 0.0;
        this.paymentHistory = false;
    }

    int getCreditHistory() {
        return creditHistory;
    }

    void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }

    double getCreditUtilization() {
        return creditUtilization;
    }

    void setCreditUtilization(double creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    boolean isPaymentHistory() {
        return paymentHistory;
    }

    void setPaymentHistory(boolean paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    int calculateCreditScore() {
        int creditScore = (creditHistory * 15) + (int)(creditUtilization * 30);
        if (paymentHistory) {
            creditScore += 55;
        } else {
            creditScore += 35;
        }
        return creditScore;
    }
}
class Assignment2_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CreditScore cs = new CreditScore();
        System.out.print("Enter Credit History: ");
        cs.setCreditHistory(sc.nextInt());
        System.out.print("Enter Credit Utilization: ");
        cs.setCreditUtilization(sc.nextDouble());
        System.out.print("Enter Payment History (true or false): ");
        boolean paymentHistory = sc.nextBoolean();
        cs.setPaymentHistory(paymentHistory);

        System.out.println("Credit Score is : " + cs.calculateCreditScore());
       
    }    
}
