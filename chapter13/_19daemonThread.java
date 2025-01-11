package chapter13;

public class _19daemonThread implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new _19daemonThread());
        t.setDaemon(true);
        t.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            System.out.println(i);

            if (i == 5) autoSave = true;
        }

        System.out.println("프로그램을 종료합니다.");
    }

    public void run() {
        while(true) {
            try {
                Thread.sleep(3 * 1000); // 3초마다
            } catch (InterruptedException e) {}

            if (autoSave) autoSave();
        }
    }

    public void autoSave() {
        System.out.println("작업물이 자동저장되었습니다.");
    }
}
