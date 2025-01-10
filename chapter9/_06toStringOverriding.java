package chapter9;

class Card {
    String kind;
    int number;

    Card() { // Card(String kind, int number)를 호출 -> 그냥 생성자로 생성하기만 하면 지정되는 기본값.
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "kind : " + kind + ", number : " + number;
    }
}

public class _06toStringOverriding {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card("Heart" , 10);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
