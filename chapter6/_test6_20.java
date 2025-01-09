package chapter6;

public class _test6_20 {
    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -999999;
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("Max : " + max(data));
        System.out.println("Max : " + max(null));
        System.out.println("Max : " + max(new int[] {})); // 크기가 0인 배열

    }
}
