package workshop13.com.elite;

import java.util.ArrayList;

public class ListTest03 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add((int) (Math.random() * 10));
            list2.add((int) (Math.random() * 10));
        }

        for (int i = 0; i < list1.size(); i++) {
            int numerator = list1.get(i);
            int denominator = list2.get(i);
            try {
                System.out.println(numerator + "/" + denominator + " " + (numerator / denominator));
            } catch (ArithmeticException e) {
                System.out.println(numerator + "/" + denominator + " 분모가 0 입니다.");
            }
        }

    }
}
