package chapter5;

public class _test5 {
    public static void main(String[] args) {
        // 5-3
        int [] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println("--------------");

        // 5-4
        int [][] arr2 = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30},
        };
        int total = 0;
        float average = 0;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                total += arr2[i][j];
            }
            average = total/(float)(arr2.length * arr2[i].length);
        }
        System.out.println(total);
        System.out.println(average);

        // 5-5
        int [] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] ball3 = new int [3];

        for (int i = 0; i < ballArr.length; i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        ball3 = new int [] {ballArr[0], ballArr[1], ballArr[2]};

        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }
        System.out.println();
    }
}
