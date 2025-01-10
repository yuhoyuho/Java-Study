package chapter9;

class Person {
    long id;

    // Object 클래스의 equals()를 오버라이딩
    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            return id == ((Person)obj).id;
        } else {
            return false;
        }
    }

    Person(long id) {
        this.id = id;
    }
}

public class _03equalsOverriding {
    public static void main(String[] args) {
        Person p1 = new Person(9011091111222L);
        Person p2 = new Person(9011091111222L);

        if(p1.equals(p2)) {
            System.out.println("p1과 p2는 같습니다.");
        } else {
            System.out.println("p1과 p2는 다릅니다.");
        }
    }
}
