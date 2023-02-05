package workshop13.com.shape;

import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();

        list.add(new Rectangle(4, 7, 5));
        list.add(new Rectangle(5, 4, 6));
        list.add(new Circle(6, 6, 7));
        list.add(new Circle(7, 8, 3));

        System.out.println("구분\t\t\t길이\t\tx좌표\ty좌표\t\tarea\t\tCircumference");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString()
                    + Math.round(list.get(i).getArea()) + "\t\t\t"
                    + Math.round(list.get(i).getCircumference()));
        }

        System.out.println("\n이동 후...");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Circle) {
                Circle result = (Circle) list.get(i);
                result.move(10, 10);
                System.out.println(result.toString());
            } else {
                Rectangle result = (Rectangle) list.get(i);
                result.move(10, 10);
                System.out.println(result.toString());
            }
        }
    }
}