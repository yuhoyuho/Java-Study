package chapter9;

import java.util.StringJoiner;

public class _11StringClass {
    public static void main(String[] args) {
//        String s = "AABBAABBBAB";
//        String s1 = s.replace("A", "B");
//        System.out.println(s1);
//        String s2 = s.replaceAll("A", "B");
//        System.out.println(s2);
//        String s3 = s.replace("AA", "BB");
//        System.out.println(s3);
//        String s4 = s.replaceFirst("A", "B");
//        System.out.println(s4);

        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        String str = String.join("-", arr);
        System.out.println(str);

        StringJoiner sj = new StringJoiner("/", "(", ")");

        for(String s : arr) {
            sj.add(s); // s = arr
        }
        System.out.println(sj.toString());
    }
}
