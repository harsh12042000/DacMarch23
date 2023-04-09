package in.cdac;

enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private int dayNumber;

    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public void printDay() {
        System.out.println(this.name());
    }

    public Day getNextDay() {
        if (this == SATURDAY) {
            return SUNDAY;
        } else {
            return values()[this.ordinal() + 1];
        }
    }

    public int getDayNumber() {
        return this.dayNumber;
    }

    public static Day[] getWeekendDays() {
        return new Day[]{SATURDAY, SUNDAY};
    }
}

public class DayofWeek {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        today.printDay();
        
        Day tomorrow = today.getNextDay();
        tomorrow.printDay();
        
        int dayNumber = today.getDayNumber();
        System.out.println(dayNumber);
        
        Day[] weekendDays = Day.getWeekendDays();
        for (Day day : weekendDays) {
            day.printDay();
        }
    }
}