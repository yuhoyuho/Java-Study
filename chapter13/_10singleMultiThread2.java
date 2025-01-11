package chapter13;

class ThreadEx3_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }

        System.out.print("소요시간 2 : " + (System.currentTimeMillis() - _10singleMultiThread2.startTime));
    }
}

public class _10singleMultiThread2 {

    static long startTime = 0;
    public static void main(String[] args) {
        ThreadEx3_1 th1 = new ThreadEx3_1();
        th1.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }

        System.out.print("소요시간 1 : " + (System.currentTimeMillis() - _10singleMultiThread2.startTime));
    }
}
