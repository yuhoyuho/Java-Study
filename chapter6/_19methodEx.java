package chapter6;

public class _19methodEx {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5l, 3l);
        long result2 = mm.subtract(5l, 3l);
        long result3 = mm.multiply(5l, 3l);
        double result4 = mm.divide(5l, 3l); // long 타입을 argument 에 입력해도 double 로 자동 형변환됨.

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        int result5 = mm.abs(4000);
        System.out.println(result5);
    }
}

class MyMath {
    long add (long a, long b) {
        return a +b;
    }
    long subtract (long a, long b) {
        return a - b;
    }
    long multiply (long a, long b) {
        return a * b;
    }
    double divide (double a, double b) {
        return a / b;
    }
    int abs (int x) {
        return x >= 0 ? x : -x;
    }
}