package workshop13.com.elite;

import java.util.ArrayList;
import java.util.HashSet;

public class ListHashSet {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);

        ArrayList<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 9) + 1);
            set.add((int) (Math.random() * 9) + 1);
        }
        System.out.println(list);

        for (int i = 0; i < size; i++) {
            set.add(list.get(i));
        }

        System.out.println(set);

    }
}
