package chapter7;

class Outer5 {
    int value = 10;

    class Inner {
        int value = 20;
        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer5.this.value);
        }
    }
}

public class _test7_8 {
    public static void main(String[] args) {
        Outer5 outer = new Outer5();
        Outer5.Inner inner = outer. new Inner();
        inner.method1();
    }
}
