package hope.data;

/**
 * 테이블이 주문한 정보를 가지고 있는 클래스
 */
public class TableOrder {
    private String menu;
    private int price;
    private int quantity;

    public void order(String menu, int price, int quantity) {
        this.menu = menu;
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotal() {
        return price * quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}