package chapter10;

import java.util.*;

public class _03calendarEx1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println("올해 년도 : " +today.get(Calendar.YEAR));
        System.out.println("월(0 ~ 11, 0 = 1월) : " +today.get(Calendar.MONTH));
        System.out.println("올해의 몇 째 주 : " +today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇 째 주 : " +today.get(Calendar.WEEK_OF_MONTH));

        System.out.println("이 달의 몇 일 : " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일 : " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("올해의 몇 일 : " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일(1 ~ 7, 1 = 일요일) : " + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("이 달의 몇 째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(today.get(Calendar.AM_PM));
        System.out.println(today.get(Calendar.HOUR));
        System.out.println(today.get(Calendar.HOUR_OF_DAY));
        System.out.println(today.get(Calendar.MINUTE));
        System.out.println(today.get(Calendar.SECOND));
        System.out.println(today.get(Calendar.MILLISECOND));
        System.out.println(today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000));
        System.out.println(today.getActualMaximum(Calendar.DATE));
    }
}
