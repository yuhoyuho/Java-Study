package chapter5;

import java.util.Arrays;

public class _18multiArray {
    public static void main(String[] args) {
        int [][] a = new int [4][3]; // 4행 3열의 2차원 배열 생성


        // 2차원 배열의 총합을 구하는 코드
        int [][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
        };
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
        }
        System.out.println("sum = " + sum);
        // 다차원배열의 출력 -> toString()이 아닌 deppToString()을 사용해야함
        int[] arr = {0, 1, 2, 3, 4};
        int [][] arr2D = {{11, 22}, {21, 22}};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        // 다차원배열의 비교 -> equals()가 아닌 Arrays.deepEquals()를 사용해야함
        String [][] str2D = {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String [][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2)); // false
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

        // copyOf() -> 시작범위 지정 불가 (처음부터 지정한 인덱스 -1까지 복사)
        // copyOfRange() -> 지정한 인덱스 -1까지 복사
        // ex) copyOfRange(arr, 2, 5) -> arr 배열의 2, 3, 4번 인덱스 복사
    }
}
