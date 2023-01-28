package com.problem13;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;
        int input = 0;
        while (true) {
            System.out.println("1.사각형 2.원 3.종료");
            System.out.print("select(1-3) : ");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    shape = new Rectangle();
                    break;
                case 2:
                    shape = new Circle();
                    break;
                case 3:
                    return;
            }

            shape.onDraw();
            shape.onDelete();
        }
    }
}
