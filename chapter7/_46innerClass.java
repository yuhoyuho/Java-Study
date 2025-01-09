package chapter7;

public class _46innerClass {
    class InstanceInner {
        int iv = 100;
//        static int cv = 100; // 에러! static 변수를 선언할 수 없다.
        final static int CONST = 100; // final static 은 상수이므로 허용
    }
    static class StaticInner {
        int iv = 200;
        static int cv = 200; // static 클래스만 static 멤버를 정의할 수 있다.
    }
    void myMethod() {
        class LocalInner {
            int iv = 300;
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
