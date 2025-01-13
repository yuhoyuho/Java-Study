package chapter15;

import java.io.*;

public class _11FileStream {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream(args[0]);

        int data = 0;

        while((data = fis.read()) != -1) {
            char c = (char)data;
            System.out.print(c);
        }

        // 커맨드라인으로부터 입력받은 파일의 내용을 읽어서
        // 그대로 화면에 출력하는 예제
    }
}
