package chapter6;
class Students {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Students (String name, int ban, int no, int kor, int eng, int math) {
        this. name = name;
        this. ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return Math.round((getTotal()) * 100) / 300.0f;
    }
}

public class _test6_3 {
    public static void main(String[] args) {
        Students s = new Students("홍길동", 1, 1, 100, 60, 76);

        System.out.println("이름 : " + s.name);
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());
    }
}
