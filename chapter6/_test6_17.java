package chapter6;
import java.util.Random;
public class _test6_17 {
    public static int[] shuffle (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = (int)(Math.random() * arr.length);
            int ex = 0;

            ex = arr[i];
            arr[i] = arr[j];
            arr[j] = ex;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int [] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
