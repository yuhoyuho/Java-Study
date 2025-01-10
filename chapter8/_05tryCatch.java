package chapter8;

public class _05tryCatch {
    public static void main(String[] args) {
//        System.out.println(1);
//        try {
//            System.out.println(2);
//            System.out.println(3);
//        } catch (Exception e) {
//            System.out.println(4);
//        }
//        System.out.println(5);

        System.out.println(1);
        try {
            System.out.println(0 / 0);
            System.out.println(2); // 윗줄에 있는 코드에서 예외가 발생했기 때문에 실행되지 않고 catch 문으로 바로 넘어김
        } catch (ArithmeticException ae) { // catch (Exception e)로 코드를 작성해도 실행됨
            System.out.println(3);
        }
        System.out.println(4);
    }
}