package chapter13;

class ThreadEx8_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) System.out.print("-");
        System.out.println("<<th1 종료>>");
    }
}

class ThreadEx8_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) System.out.print("|");
        System.out.println("<<th2 종료>>");
    }
}

public class _23sleep {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();
        th1.start();
        th2.start();

        try {
            th1.sleep(2000);
        } catch (Exception e) {}

        System.out.println("<<main 종료>>");
    }
}
