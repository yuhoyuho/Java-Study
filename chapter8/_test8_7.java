package chapter8;
import java.util.*;

public class _test8_7 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0; // 사용자입력을 저장하는 공간
        int count = 0; // 시도횟수를 세기 위한 변수

        do {
            count++;
            System.out.println("1과 100사이의 값을 입력하세요 : ");

            try {
                input = new Scanner(System.in).nextInt(); // try 문에 있는 문장은 반드시 실행되기 때문에
                                                          // 위에 적혀있던 (input ~ nextInt())를 try 문 내부로 작성해줌.
            } catch(Exception e) {
                System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
                continue;
            }

            if (answer > input) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 " + count + "번입니다.");
                break;
            }
        } while (true);
    }
}