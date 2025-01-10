package chapter10;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Calendar;
import java.util.Date;

public class _08dateCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date d = new Date(cal.getTimeInMillis());

        System.out.println(d);

        Date d1 = new Date();
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(d1);
        System.out.println(cal1);
    }
}
