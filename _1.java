package Programmers;
import java.util.*;

public class _1 {
}

class Solution {
    public int solution(String s) {
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] alphabet = {"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine"};

        for(int i = 0; i < 10; i++) {
            s = s.replaceAll(alphabet[i], num[i]);
        }

        return Integer.parseInt(s);
    }
}