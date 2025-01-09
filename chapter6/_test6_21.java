package chapter6;

public class _test6_21 {
    public static int abs(int x) {
        return x >= 0 ? x : -x;
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(abs(value));

        value = -10;
        System.out.println(abs(value));
    }
}
