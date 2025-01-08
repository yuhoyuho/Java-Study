package chapter3;

import java.util.Scanner;

public class _15논리연산자 {
    public static void main(String[] args) {
        //1 x는 10보다 크고, 20보다 작다.
//        System.out.println((x > 10)&&(x < 20));

        //2 i는 2의 배수 또는 3의 배수이다.
//        System.out.println((i % 2 ==0) || (i % 3 ==0));

        //3 i는 2의 배수 또는 3의 배수이지만 6의 배수는 아니다.
//        System.out.println(((i % 2 == 0)||(i % 3 == 0)) && i % 6 !=0);

        //4 문자 ch는 숫자 0 ~ 9 이다.
//        System.out.println('0' <= ch && ch <= '9');

        //5 문자 ch는 대문자 또는 소문자이다.
//        System.out.println(('a'<= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z'));

        Scanner scanner = new Scanner(System.in);
        char ch = ' ';
        System.out.printf("문자를 하나 입력하세요 > ");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if ('0' <= ch && ch < '9') {
            System.out.println("입력하신 문자는 숫자입니다.");
        }

        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("입력하신 문자는 영문자입니다.");
        }
    }
}
