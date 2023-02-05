package workshop13.com.list02;

import java.util.ArrayList;

public class ConvertList {
    public ArrayList<Integer> convertList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = array.length - 1; i >= 0; i--) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }
}
