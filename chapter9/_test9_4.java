package chapter9;

public class _test9_4 {

    public static boolean contains(String src, String target) {
        return src.indexOf(target) != -1;
    }
    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
    }
}
