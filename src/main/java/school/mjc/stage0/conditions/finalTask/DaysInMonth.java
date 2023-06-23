package school.mjc.stage0.conditions.finalTask;

import java.util.Arrays;
import java.util.List;

public class DaysInMonth {
    public boolean isLeapYear(int year){
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public int daysInMonth(int year, int month){
        List<Integer> months = Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
        return months.get(month - 1) + ((isLeapYear(year))? 1 : 0);
    }

    public void printDays(int year, int month) {
        if(month < 0 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        System.out.println(daysInMonth(year, month));
    }
}
