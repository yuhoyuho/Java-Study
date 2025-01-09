package chapter7;
class Out {
    class Inner {
        int iv = 100;
    }
}

public class _test7_6 {
    public static void main(String[] args) {
        Out oc = new Out();
        Out.Inner ic = oc.new Inner();
        System.out.println(ic.iv);
    }
}
