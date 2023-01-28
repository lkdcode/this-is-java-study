package com.cafe;

public class CafeTest {
    public static void main(String[] args) {
        Cafe cafe = new Cafe(3);

        Coffee americano = new Coffee("Americano", 4000);
        Coffee caffelatte = new Coffee("Caffelatte", 5000);
        Coffee macchiato = new Coffee("Macchiato", 6000);

        cafe.setCoffee(americano);
        cafe.setCoffee(caffelatte);
        cafe.setCoffee(macchiato);

        for (Coffee coffee : cafe.getCoffeeList()) {
            System.out.println(coffee.toString());
        }

        System.out.println("\nCoffee 가격의 합 : " + cafe.totalPrice() + "원");
    }
}
