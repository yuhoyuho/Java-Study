package chapter4;


public class asdksaldklf {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num_list = {12, 4, 15, 36, 38, -2, 15};
        int x = solution.Solution(num_list);
//        System.out.println(x);

        int a = Integer.parseInt("1");
        int b = Integer.parseInt("0");
        String c = Integer.toString(a + b);
        System.out.println(c);
    }
}

class Solution {
    public int Solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            } else {answer -= 1;}
        }
        return answer;
    }
}