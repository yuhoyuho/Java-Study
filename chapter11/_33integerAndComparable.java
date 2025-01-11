package chapter11;
import java.util.*;

public class _33integerAndComparable {
    public static void main(String[] args) {
        Integer[] arr = {30, 50, 10, 40, 20};

        Arrays.sort(arr); // Integer 가 가지고 있는 기본 정렬 기준 compareTo()로 정렬
        System.out.println(Arrays.toString(arr));

        // sort(Object[] objArr, Comparator C)
        Arrays.sort(arr, new DescComp());
        System.out.println(Arrays.toString(arr));
    }
}

class DescComp implements Comparator {
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Integer && o2 instanceof Integer)) {
            return -1;
        }

        Integer i = (Integer) o1;
        Integer i2 = (Integer) o2;
        // return i2 - i 또는 return i2.compareTo(i)도 가능
        return i.compareTo(i2) * -1; // 기본 정렬인 compareTo()의 역순으로 정렬
    }
}