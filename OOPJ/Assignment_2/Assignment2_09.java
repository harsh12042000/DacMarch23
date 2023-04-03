import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

/*
You are required to write a Java program to implement a Date class.
The Date class should have the following fields:
a. day: An integer field to store the day of the month.
b. month: An integer field to store the month of the year.
c. year: An integer field to store the year.
The Date class should have the following methods:
a. isValid(): A method to check if the date is valid or not. A date is considered
valid if it is a valid date of the Gregorian calendar, and has a day, month, and
year that are within a reasonable range.
b. getDayOfWeek(): A method to return the day of the week for the given date,
where Sunday is represented by 0, Monday by 1, and so on.
c. isLeapYear(): A method to check if the year of the given date is a leap year or
not.
d. getNextDay(): A method to return the date of the next day.
e. getPreviousDay(): A method to return the date of the previous day.
Example Usage
Date date = new Date(31, 12, 2022);
System.out.println(date.isValid()); // true
System.out.println(date.getDayOfWeek()); // 6 (Saturday)
System.out.println(date.isLeapYear()); // false
Date nextDay = date.getNextDay();
System.out.println(nextDay); // 01-01-2023
Date previousDay = date.getPreviousDay();
System.out.println(previousDay); // 30-12-2022
 */
class Date {
    private int day;
    private int month;
    private int year;

    Date() {
        day = 0;
        month = 0;
        year = 0;
    }

    void setYear(int year) {
        this.year = year;
    }  

    void setMonth(int month) {
        this.month = month;
    }

    void setDay(int day) {
        this.day = day;
    }

    int getYear() {
        return this.year;
    }

    int getMonth() {
        return this.month;
    }

    int getDay() {
        return this.day;
    }
}

class DateOprations{

    Date d = new Date();
    Scanner sc = new Scanner(System.in);

    void acceptRecord() {
        System.out.print("Enter Year :");
        d.setYear(sc.nextInt());
        System.out.print("Enter Month :");
        d.setMonth(sc.nextInt());
        System.out.print("Enter Day :");
        d.setDay(sc.nextInt());
    }

    void isValid() {
        LocalDate date = LocalDate.of(d.getYear(),d.getMonth(),d.getDay());
        try {
            System.out.println("Valid date: " + date);
        } catch (DateTimeException e) {
            System.out.println("Invalid date");
        }
    }

    void getDayOfWeek() {
        LocalDate date = LocalDate.of(d.getYear(),d.getMonth(),d.getDay());
        System.out.println("Day of Week : " + date.getDayOfWeek());
    }

    void isLeapYear() {
        LocalDate date = LocalDate.of(d.getYear(),d.getMonth(),d.getDay());
        System.out.println("is leap Year : " + date.isLeapYear());
    }

    void getNextDay() {
        LocalDate date = LocalDate.of(d.getYear(),d.getMonth(),d.getDay());
        System.out.println("Next Day : " + date.plusDays(1));   
    }

    void getPreviousDay() {
        LocalDate date = LocalDate.of(d.getYear(),d.getMonth(),d.getDay());
        System.out.println("Previous Day : " + date.minusDays(1));
    }
}
class Assignment2_09 {
    public static void main(String[] args) {

        DateOprations d = new DateOprations();
        d.acceptRecord();
        d.isValid(); 
        d.getDayOfWeek(); 
        d.isLeapYear(); 
        d.getNextDay();
        d.getPreviousDay();
    }    
}