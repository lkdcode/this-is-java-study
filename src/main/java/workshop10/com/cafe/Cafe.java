package workshop10.com.cafe;

public class Cafe {
    private Coffee[] coffeeList;
    private int index;

    public Cafe(int size) {
        this.coffeeList = new Coffee[size];
        this.index = 0;
    }

    public int totalPrice() {
        int totalPrice = 0;

        for (Coffee coffee : this.coffeeList) {
            totalPrice += coffee.getPrice();
        }

        return totalPrice;
    }

    public Coffee[] getCoffeeList() {
        return coffeeList;
    }

    public void setCoffee(Coffee coffee) {
        if (index == coffeeList.length) {
            System.out.println("더 이상 저장할 수 없습니다.");
            return;
        }

        this.coffeeList[index] = coffee;
        this.index++;
    }
}
