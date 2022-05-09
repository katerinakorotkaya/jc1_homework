package my.homework.task9;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar cldr = new GregorianCalendar(2022, 3, 2);
        cldr.set(Calendar.YEAR, 2022);
        cldr.set(Calendar.MONTH, 3);
        cldr.set(Calendar.DATE, 2);
        cldr.set(Calendar.HOUR_OF_DAY, 11);
        cldr.set(Calendar.MINUTE, 20);
        cldr.set(Calendar.SECOND, 10);
        Date date = cldr.getTime();
        System.out.println("The current date: " + date);
        cldr.add(Calendar.DATE, 1);
        System.out.println("The date of the next day: " + cldr.getTime());
    }
}
