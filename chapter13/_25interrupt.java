package chapter13;
import javax.swing.JOptionPane;

class ThreadEx9_1 extends Thread {
    public void run() {
        int i = 10;

        while(i != 0 && !isInterrupted()) { // isInterrupted()가 false 인 동안 -> interrupted()가 false 인 동안
            System.out.println(i--);
            for(long x = 0; x < 2500000000L; x++);
        }

        System.out.println("카운트가 종료되었습니다.");
    }
}

public class _25interrupt {
    public static void main(String[] args) {
        ThreadEx9_1 th1 = new ThreadEx9_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt();
        System.out.println("isInterrupted() : " + th1.isInterrupted());
    }
}
