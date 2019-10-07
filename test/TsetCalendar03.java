package cn.qq.com;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TsetCalendar03 {
    public static void main(String[] args) {
      String str = "2019-08-02";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = df.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar a = new GregorianCalendar();
        a.setTime(date);
        a.set(Calendar.DAY_OF_MONTH,1);
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");
        for (int j = 0; j < a.get(Calendar.DAY_OF_WEEK) -1; j++) {
            System.out.print("\t");
        }
        int days = a.getActualMaximum(Calendar.DATE);
        for (int i = 1; i <= days ; i++) {
            System.out.print(a.get(Calendar.DAY_OF_MONTH) + "\t");
            if (a.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.println();
            }
            a.add(Calendar.DAY_OF_MONTH,1);

        }

    }
}
