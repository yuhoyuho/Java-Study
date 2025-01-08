package chapter4;

public class _17while {
    public static void main(String[] args) {
//        int i = 0;
//        int sum = 0;
//
//        while (sum <= 100) {
//            System.out.println(i + "번째 합 : " + sum);
//            sum += ++i;

        int i = 0;
        int sum = 0;

        while (sum < 100) {
            ++i;
            sum += i;

            if (sum > 100){
                break;
            }
        }
        System.out.println(i);
        System.out.println(sum);
    }
}
