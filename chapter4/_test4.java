package chapter4;

public class _test4 {
    public static void main(String[] args) {
        // 4-2
        int sum = 0;
        for (int i = 1; i < 21; i++){
            if (i % 2 == 0) {
                continue;
            }

            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);

        // 4-3
        int sum2 = 0;
        for (int i = 1; i < 11; i++) {
            sum2 += i * (11 - i);
            }
        System.out.println(sum2);

        // 4-4
        int sum3 = 0;
        for (int i = 1; i < 200; i++) {
            if (i % 2 == 1) {
                sum3 += i;
            } else {
                sum3 -= i;
            }
            System.out.println(i + " " + sum3);
        }

        // 4-5
        int i = 1;
        while (true) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            i++;

            if (i == 11) {
                break;
            }

            System.out.println();
        }
    }
}