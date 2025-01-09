package chapter7;

import com.sun.org.apache.xml.internal.utils.IntStack;
import sun.security.jca.GetInstance;

public class _47innerClass2 {
    class InstanceInner{}
    static class StaticInner {}

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        // static 멤버는 인스턴스멤버에 직접 접근할 수 없다.
        StaticInner obj2 = new StaticInner();

        // 굳이 접근하려면 아래와 같이 객체를 생성하고 접근해야 한다.
        _47innerClass2 outer = new _47innerClass2();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        // 인스턴스메서드에서는 인스턴스 멤버와 static 멤버 모두 접근 가능하다.
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        // 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
        // 아래에 있는 LocalInner 같은 경우
    }

    void myMethod() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }
}
