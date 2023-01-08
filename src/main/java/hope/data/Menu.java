package hope.data;

/**
 * 판매되는 메뉴를 관리하는 클래스
 */
public class Menu {
    private String name;
    private int price;
    private int quantity;

    public Menu(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

}
