package chapter12;
import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))

public class _39Annotation {
    public static void main(String[] args) {
        Class<_39Annotation> cls = _39Annotation.class; // Annotation의 Class객체를 얻는다.

        TestInfo anno = cls.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy() = " + anno.testedBy());
        System.out.println("anno.testDate().yymmdd() = " + anno.testDate().yymmdd());
        System.out.println("anno.testDate().hhmmss() = " + anno.testDate().hhmmss());

        for(String str : anno.testTools()) {
            System.out.println("testTools = " + str);
        }

        System.out.println();

        Annotation[] annoArr = cls.getAnnotations();

        for(Annotation a : annoArr) {
            System.out.println(a);
        }
    }
}

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 지정
@interface TestInfo {
    int count() default 1;
    String testedBy();
    String[] testTools()    default "JUnit";
    TestType testType() default TestType.FIRST;
    DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
    String yymmdd();
    String hhmmss();
}

enum TestType {FIRST, FINAL}