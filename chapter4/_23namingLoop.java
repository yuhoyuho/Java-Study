package chapter4;

public class _23namingLoop {
    public static void main(String[] args) {
        Loop1 : for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 5){
                    break Loop1;
                }
                System.out.print(i + " x " + j + " = " + i*j + " ");
            }
            System.out.println();
        }
    }
}
