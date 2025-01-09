package chapter6;

//6-2
class Student {
    // 생성자 초기 선언 (초기화 x)
    String a;
    int b;
    int c;
    int d;
    int e;
    int f;

    // 생성자 추가하는 코드
    Student(String a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // info() 메서드 추가하는 코드
    String info () {
        return a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + "236, " + "78.7";
    }
}

public class _test6 {
    public static void main(String[] args) {
        Student s = new Student ("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }
}
