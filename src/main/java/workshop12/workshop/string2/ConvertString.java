package workshop12.workshop.string2;

import java.text.DecimalFormat;

public class ConvertString {

    public String convert(int money) {
        DecimalFormat formatter = new DecimalFormat("#,###,###");
        return formatter.format(money) + "원";
    }
}
