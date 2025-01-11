package chapter11;
import java.util.*;

public class _37HashSetEx3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " : " + age;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Person)) {
            return false;
        }
        Person p = (Person)obj;
        return name.equals(p.name) && age == p.age;
    }
    public int hashCode() {
        return Objects.hash(name, age); // int hash(Object...values)
    }
}