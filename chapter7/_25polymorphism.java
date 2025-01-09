package chapter7;

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("Brrrrrrrr");
    }
    void stop() {
        System.out.println("Stop!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("Water!!!!!!");
    }
}

public class _25polymorphism {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (Car) fe;에서 형변환이 생략됨
//        car.water();
        fe2 = (FireEngine) car;
        fe2.water();
    }
}
