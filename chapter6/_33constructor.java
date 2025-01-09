package chapter6;

class Car {
    String color;
    String gearType;
    int door;

    Car (String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

public class _33constructor {
    public static void main(String[] args) {
        Car c = new Car("black", "auto", 4);

        System.out.println("Color : " + c.color + "\nGearType : " + c.gearType + "\nDoor : " + c.door);
    }
}
