package chapter15;
import java.io.*;

public class _28standardIO {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("test.txt");
            ps = new PrintStream(fos);
            System.setOut(ps); // System.out 의 출력대상을 test.txt 파일로 변경
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
}
