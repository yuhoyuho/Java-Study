package chapter2;

import java.util.Scanner; // Scanner 클래스를 사용하기 위해 추가

public class _14_화면으로부터입력받기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 클래스의 객체를 생성

        System.out.print("두자리 정수를 하나 입력해주세요. > ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d\n", num);
        System.out.println("11");

        byte b = 12;
    }
}
