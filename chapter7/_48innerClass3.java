package chapter7;

class Outer {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner {
        static int scv = outerCv; // static 을 붙이지 않으면 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            // 외부클래스의 지역변수에 접근할 때는 final 이 붙은 상수에만 접근할 수 있다.
            //int llv3 = lv;  ->  myMethod 의 지역변수이지만 final 이 붙지 않아서 에러 발생!
            int liv4 = LV; // final int LV로 정의되어 있기 때문에 접근 가능
        }
    }
}

public class _48innerClass3 {
}
