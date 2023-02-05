package workshop12.workshop.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDate {

    public String convert(Date date, int type) {

        switch (type) {
            case 1:

                return new SimpleDateFormat("yyyy-MM-dd").format(date);
            case 2:

                return new SimpleDateFormat("yy년 MM월 dd일 E요일").format(date);
            case 3:

                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a").format(date);
            default:

                return null;
        }

    }
}
