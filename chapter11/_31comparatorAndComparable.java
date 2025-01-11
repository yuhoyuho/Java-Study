package chapter11;

import com.sun.org.apache.bcel.internal.classfile.DescendingVisitor;

import java.text.DecimalFormatSymbols;
import java.util.*;

public class _31comparatorAndComparable {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println("strArr : " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 안함
        System.out.println("strArr : " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("strArr : " + Arrays.toString(strArr));
    }
}
class Descending implements Comparator {
    public int compare (Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬방식의 역으로 변경
                                          // or c2.compareTo(c1) 을 사용해서 순서를 바꿔도 됨
        }
        return -1;
    }
}