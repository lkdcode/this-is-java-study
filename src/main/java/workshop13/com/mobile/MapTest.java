package workshop13.com.mobile;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Mobile> map = new HashMap<String, Mobile>();
        double sum = 0.0;

        map.put("LU6800", new Mobile("LU6800", "Optimus 2X", 800000));
        map.put("SU6600", new Mobile("SU6600", "Optimus Black", 900000));
        map.put("KU5700", new Mobile("KU5700", "Optimus Big", 700000));
        map.put("SU7600", new Mobile("SU7600", "Optimus Mach", 950000));

        Iterator<String> names = map.keySet().stream().iterator();
        for (int i = 0; i < map.size(); i++) {
            Mobile mobile = map.get(names.next());
            System.out.println(mobile.printInfo());
            sum += mobile.getPrice();
        }

        System.out.println("합계 : " + sum + "\n");
        System.out.println("가격 변경 후");
        names = map.keySet().stream().iterator();

        for (int i = 0; i < map.size(); i++) {
            map.get(names.next()).setPrice();
        }

        sum = 0;
        names = map.keySet().stream().iterator();

        for (int i = 0; i < map.size(); i++) {
            Mobile mobile = map.get(names.next());
            System.out.println(mobile.printInfo());
            sum += mobile.getPrice();
        }

        System.out.println("합계 : " + sum);

    }
}
