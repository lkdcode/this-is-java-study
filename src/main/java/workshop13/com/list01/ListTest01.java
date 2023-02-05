package workshop13.com.list01;

import java.util.ArrayList;

public class ListTest01 {
    public static void main(String[] args) {
        MakeList makeList = new MakeList();
        int size = Integer.parseInt(args[0]);
        makeList.makeArrayList(size);

        ArrayList<Integer> list = makeList.getList();

        System.out.println(list);
        System.out.println("평균 : " + makeList.getAverage());
    }
}
