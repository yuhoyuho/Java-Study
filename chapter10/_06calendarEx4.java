package chapter10;

import java.util.Calendar;

public class _06calendarEx4 {
    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) +"일";
    }

    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2019, 7, 31);
        System.out.println(toString(date));

        System.out.println("--- 1일 후 ---");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        date.set(2019,2,31);
        System.out.println(toString(date));
        date.roll(Calendar.MONTH, 1);
        System.out.println(toString(date));
    }
}
