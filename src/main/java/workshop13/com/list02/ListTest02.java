package workshop13.com.list02;

import java.util.ArrayList;

public class ListTest02 {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 5, 2, 3, 6, 7, 5, 7, 9};
        ArrayList<Integer> list = new ConvertList().convertList(array);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
