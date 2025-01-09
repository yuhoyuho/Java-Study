package chapter7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Outer4 {
    static class Inner {
        int iv = 200;
    }
}

public class _test7_7 {
    public static void main(String[] args) {
        Outer4.Inner si = new Outer4.Inner();
        System.out.println(si.iv);
    }
}
