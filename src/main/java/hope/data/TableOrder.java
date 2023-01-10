package hope.data;

import java.util.HashMap;

/**
 * 테이블이 주문한 정보를 가지고 있는 클래스
 */
public class TableOrder {
    private final HashMap<Integer, Integer> menuList;
    private String menuName;
    private int price;
    private int quantity;
    private int total;

    public String getMenuName() {
        return menuName;
    }

    public TableOrder() {
        this.menuList = new HashMap<>();
        menuList.put(1, 16000);
        menuList.put(2, 16000);
        menuList.put(3, 16000);
        menuList.put(4, 16000);
        menuList.put(5, 17000);
        menuList.put(6, 17000);
        menuList.put(21, 1000);
        menuList.put(22, 1000);
    }

    public TableOrder(int menuNumber, int orderQuantity) {
        this();
        this.price = this.menuList.get(menuNumber);
        this.menuName = menuName(menuNumber);
        this.quantity = orderQuantity;
        this.total = this.price * this.quantity;
    }

    private String menuName(int menuNumber) {
        String menu = "";

        switch (menuNumber) {
            case 1:
                menu = "🍗 후라이드";
                break;
            case 2:
                menu = "🍗 양념치킨";
                break;
            case 3:
                menu = "🍗 반반치킨";
                break;
            case 4:
                menu = "🍗 통구이";
                break;
            case 5:
                menu = "🍗 간장치킨";
                break;
            case 6:
                menu = "🍗 순살치킨";
                break;
            case 21:
                menu = "🥤 콜라";
                break;
            case 22:
                menu = "🧃 사이다";
                break;
        }
        return menu;
    }

    public int getTotal() {
        return total;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}
