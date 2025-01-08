package chapter2;

public class _09_두변수의값바꾸기 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int tmp;
        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
