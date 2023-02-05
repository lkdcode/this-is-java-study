package workshop13.com.list01;

import java.util.ArrayList;

public class MakeList {
    ArrayList<Integer> list;

    public MakeList() {
        this.list = new ArrayList<>();
    }

    public void makeArrayList(int size) {
        for (int i = 0; i < size; i++) {
            this.list.add((int) (Math.random() * 10) + 10);
        }
    }

    public double getAverage() {
        int total = 0;
        for (int i = 0; i < this.list.size(); i++) {
            total += this.list.get(i);
        }

        return (double) total / this.list.size();
    }

    public ArrayList<Integer> getList() {
        return this.list;
    }
}
