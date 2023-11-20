package Task1_pg13;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Weekday.MONDAY.whichIsGreater(Weekday.TUESDAY);
        Weekday.FRIDAY.whichIsGreater(Weekday.WEDNESDAY);
        Weekday.THURSDAY.whichIsGreater(Weekday.THURSDAY);


        System.out.println("Sunday is holiday: " + Weekday.SUNDAY.isHoliday());
        System.out.println("Saturday is holiday: " + Weekday.SATURDAY.isHoliday());
        System.out.println("Monday is holiday: " + Weekday.MONDAY.isHoliday());

        System.out.println("Sunday is week day: " + Weekday.SUNDAY.isWeekDay());
        System.out.println("Saturday is week day: " + Weekday.SATURDAY.isWeekDay());
        System.out.println("Monday is week day: " + Weekday.MONDAY.isWeekDay());




    }
}
