package chapter13;

class Thread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
    }
}

public class _test13_1 {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Thread1());
        th1.start();
    }
}
