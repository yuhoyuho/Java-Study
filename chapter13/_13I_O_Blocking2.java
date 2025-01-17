package chapter13;
import javax.swing.JOptionPane;

class ThreadEx5_1 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);

            try {
                sleep(1000);
            } catch (Exception e){};
        }
    }
}

public class _13I_O_Blocking2 {
    public static void main(String[] args) {
        ThreadEx5_1 th1 = new ThreadEx5_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
    }
}
