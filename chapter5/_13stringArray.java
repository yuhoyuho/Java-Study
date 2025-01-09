package chapter5;

public class _13stringArray {
    public static void main(String[] args) {
        String [] name = {"Kim", "Park", "Yi"};

        for (int i = 0; i < name.length; i++) {
            System.out.println("name["+i+"] : " + name[i]);
        }

        /*
        String 의 클래스
        1) String.substring() -> 문자열의 추출 기능
        2) String.equals() -> 문자열의 비교 (대소문자 구분)
                           -> 대소문자 구분 없이 사용하려면 String.equalsIgnoreCase()사용
        */

    }
}
