package workshop12.workshop.date;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        String result1 = new ConvertDate().convert(new Date(), Integer.parseInt(args[0]));
        String result2 = new ConvertDate().convert(new Date(), Integer.parseInt(args[1]));
        String result3 = new ConvertDate().convert(new Date(), Integer.parseInt(args[2]));

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
