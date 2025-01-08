package chapter2;

public class _test2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        int a = x;
        x = y;
        y = z;
        z = a;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
