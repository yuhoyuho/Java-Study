package chapter3;

public class _test3 {
    public static int test3(int num) {
        int result = (num / 100) * 100;

        return result;
    }

    public static void main(String[] args) {
        // 3-3
        int num = 456;
        System.out.println(test3(999));

        // 3-4
        int numOfApples = 123;
        int sizeOfBucket = 10;
        int numOfBucket = Math.round(numOfApples / sizeOfBucket) + 1;

        System.out.println("필요한 바구니의 수 : " + numOfBucket);

        // 3-5
        int num2 = 10;
        System.out.println(num2 > 0 ? "양수" : (num2 ==0 ? "0" : "음수"));

        // 3-6
        int fahrenheit = 100;
        float celcius = 5/9 * (fahrenheit - 32);
    }
}
