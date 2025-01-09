package chapter5;

import java.util.Arrays;

public class _1array {
    public static void main(String[] args) {
        int[] score = new int[] {
          50, 60, 70, 80, 90
        };

        int[] score2 = {50, 60, 70, 80, 90}; // 위 코드와 같은 배열 생성

        int[] score3;
        score3  = new int[] {50, 60, 70, 80, 90}; // 위 코드와 같은 배열 생성

        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + ", ");
        }
        System.out.println();

        System.out.println(Arrays.toString(score));

        System.out.println(score);

        char[] chArr = {'a', 'b', 'c', 'd'};
        System.out.println(chArr);
    }
}
