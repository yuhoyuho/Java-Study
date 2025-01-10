package chapter10;
import java.util.*;

public class _07calendarEx5 {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage : java _07calendarEX5 2019 9");
            return;
        }
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance(); // 시작일
        Calendar eDay = Calendar.getInstance(); // 끝일

        // 월의 경우 0 ~ 11의 값을 가지므로 1을 빼주어야 한다.
        // ex) 2019년 11월 1일은 (2019, 10, 1)로 작성
        sDay.set(year, month - 1, 1);
        eDay.set(year, month, 1);

        eDay.add(Calendar.DATE, -1); // 다음달 1일에서 -1일 = 이번달 말일

        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("    " + args[0] + "년 " + args[1] + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        // 해당 월의 1일이 어느 요일인지에 따라 그만큼 공백을 출력
        // 만약 1일이 수요일이라면 공백을 3번 (일, 월,화)
        for (int i = 1; i < START_DAY_OF_WEEK; i++) {
            System.out.println(" ");
        }

        for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
            System.out.println((i < 10) ? "  " + i : " " + i);
            if(n % 7 == 0) {
                System.out.println();
            }
        }
    }
}
