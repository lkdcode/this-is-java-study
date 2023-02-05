package workshop13.com.shape;

import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {

        ArrayList<Movable> list = new ArrayList<>();

        list.add(new Rectangle(4, 7, 5));
        list.add(new Rectangle(5, 4, 6));
        list.add(new Circle(6, 6, 7));
        list.add(new Circle(7, 8, 3));

        System.out.println("구분\t\t\t길이\t\tx좌표\ty좌표\t\tarea\t\tCircumference");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i).toString());
        }

        System.out.println("이동 후...");

        for (int i = 0; i < list.size(); i++) {
            list.get(i).move(10, 10);
            System.out.println(list.get(i).toString());
        }
    }
}
