package hope.data;

import java.util.ArrayList;
import java.util.List;

/**
 * 테이블 정보를 가지고 있는 클래스
 */
public class Table {
    private int number;
    private List<TableOrder> tableBills;
    private String upperShape;
    private String middleShape;
    private String lowerShape;

    public int getNumber() {
        return number;
    }

    public Table() {
        this.tableBills = new ArrayList<>();
    }

    public Table(int number) {
        this();
        this.number = number;
    }


    public List<TableOrder> getTableBills() {
        return tableBills;
    }


    public int getPrice() {
        int price = 0;
        for (int i = 0; i < tableBills.size(); i++) {
            price += tableBills.get(i).getTotal();
        }

        return price;
    }

    /**
     * 네이밍 수정
     */
    public void order(int menuNumber, int orderQuantity) {
        this.tableBills.add(new TableOrder(menuNumber, orderQuantity));
    }


    public String getUpperShape() {
        this.upperShape = "┏ - ┓";
        return upperShape;
    }

    public String getMiddleShape() {
        this.middleShape = "| " + this.number + " |";
        return middleShape;
    }

    public String getLowerShape() {
        this.lowerShape = "┗ - ┛";
        return lowerShape;
    }

}
