package chapter15;
import java.io.*;

public class _24Buffered {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("_24Buffered");
            //FileReader fr = new FileReader("---");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            for (int i = 1; (line = br.readLine()) != null; i++) {
                // ";"을 포함한 라인을 출력
                if (line.indexOf("l") != -1) {
                    System.out.println(i + ":" + line);
                }
            }

            br.close();
        } catch (IOException e) {}
    }
}
