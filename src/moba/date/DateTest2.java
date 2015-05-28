package moba.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by hc on 5/28/15.
 */
public class DateTest2 {
    public static void main(String[] args) {
        String skey = "MAIN4";
        String result = "Thx. Km sdh berlangganan layanan Fon4Fun s/d ";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());

        if (skey.equals("MAIN1") || skey.equals("MAIN2")) {
            c.add(Calendar.DATE, 1);
            result += sdf.format(c.getTime());
        } else if (skey.equals("MAIN3")) {
            c.add(Calendar.DATE, 3);
            result += sdf.format(c.getTime());
        } else if (skey.equals("MAIN4")) {
            c.add(Calendar.DATE, 7);
            result += sdf.format(c.getTime());
        } else if (skey.equals("MAIN5")) {
            c.add(Calendar.DATE, 30);
            result += sdf.format(c.getTime());
        }
        result += ". Stop: ktk UNREG MAIN2 kirim ke 93151. cs:02129315556";

        System.out.println(result);
    }
}
