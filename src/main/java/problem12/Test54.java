package problem12;

import java.text.DecimalFormat;
import java.util.HashMap;

public class Test54 {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("###,###");

        HashMap<String, Integer> ht = new HashMap<>();
        ht.put("콩쥐팥쥐", 15000);
        ht.put("백설공주", 10000);
        ht.put("보물섬", 18000);

        System.out.println("콩쥐팥쥐의 책가격 = " + formatter.format(ht.get("콩쥐팥쥐")) + "원");
        System.out.println("백설공주의 책가격 = " + formatter.format(ht.get("백설공주")) + "원");
        System.out.println("보물섬의 책가격 = " + formatter.format(ht.get("보물섬")) + "원");
    }

}
