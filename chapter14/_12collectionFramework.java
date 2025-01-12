package chapter14;

import java.util.*;
import java.util.stream.*;

public class _12collectionFramework {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);

        list.replaceAll(i -> i * 10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        map.forEach((k, v) -> System.out.print("{"+k+", "+v+"},"));
        System.out.println();





        String[] strArr = {"aaa", "bbb", "ccc"};
        List<String> strList = Arrays.asList(strArr);

        Stream<String> strStream1 = strList.stream();
        Stream<String> strStream2 = Arrays.stream(strArr); // 배열에 먼저 담아야하기 때문에 Arrays.stream()사용

        strStream1.sorted().forEach(System.out :: println);
        strStream2.sorted().forEach(System.out :: println);
    }
}
