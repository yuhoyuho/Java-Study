package chapter14;
import java.io.*;
import java.util.stream.*;

public class _31streamMap {
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),
                          new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};

        Stream<File> fileStream = Stream.of(fileArr);

        // map()으로 Stream<File>을 Stream<String>으로 변환
        Stream<String> filenameStream = fileStream.map(File :: getName);
        filenameStream.forEach(System.out :: println);

        fileStream = Stream.of(fileArr); // Stream 을 다시 생성

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1) // 확장자가 없는 것은 제외
                .map(s -> s.substring(s.indexOf('.') + 1)) // 확장자만 추출
                .map(String::toUpperCase) // 대문자로 변환
                .distinct() // 중복 제거
                .forEach(System.out::print); //
        System.out.println();
    }
}
