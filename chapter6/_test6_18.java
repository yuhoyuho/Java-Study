package chapter6;

public class _test6_18 {
    public static boolean isNumber(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch > '9' || ch < '0') { // charAt을 사용했을 때 숫자가 아닌것을 나타내는 코드 ex) 문자인 경우 false 를 반환
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(isNumber(str));

        str = "1234o";
        System.out.println(isNumber(str));
    }
}
