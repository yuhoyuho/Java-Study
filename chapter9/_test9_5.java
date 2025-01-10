package chapter9;

public class _test9_5 {

    public static String delChar(String src, String delCh) {
        StringBuffer sb = new StringBuffer(src.length());

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);

            if(delCh.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString(); // StringBuffer 에 저장된 내용을 String 으로 반환해줌.
    }

    public static void main(String[] args) {
        System.out.println(delChar("@1328812737@@!~)#(", "@!~()#"));
    }
}
