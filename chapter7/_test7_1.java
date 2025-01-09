package chapter7;
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (i == 1 || i == 3 || i == 8);

            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int)(Math.random() * cards.length);
            SutdaCard ct = cards[i];
            cards[i] = cards[j];
            cards[j] = ct;
        }
    }

    SutdaCard pick(int index) {
        if (index < 0 || index > CARD_NUM) {
            return null;
        }
        return cards[index];
    }

    SutdaCard pick() {
//        return cards[(int)(Math.random() * cards.length)]; 아래 코드 두 줄과 같은 결과
        int index = (int)(Math.random() * cards.length);
        return pick(index);
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toSting() {
        return num + (isKwang ? "k" : "");
    }
}

public class _test7_1 {
    public static void main(String[] args) {

    }
}
