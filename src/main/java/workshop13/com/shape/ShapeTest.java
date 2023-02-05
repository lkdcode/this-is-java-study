package workshop13.com.shape;

import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {

        ArrayList<Shape> list = new ArrayList<>();

        list.add(new Rectangle(4, 7, 5));
        list.add(new Rectangle(5, 4, 6));
        list.add(new Circle(6, 6, 7));
        list.add(new Circle(8, 3, 7));

        System.out.println("구분\t\t\t길이\t\tx좌표\t\ty좌표\t\tarea\t\tCircumference");


        System.out.println("이동 후...");
    }
}
