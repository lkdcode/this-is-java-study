package hope.data;

import java.util.ArrayList;
import java.util.List;

/**
 * 테이블 정보를 가지고 있는 클래스
 */
public class Table {
    private int number;
    private List<TableOrder> tableBills;

    public List<TableOrder> getTableBills() {
        return tableBills;
    }



    private String upperShape;
    private String middleShape;
    private String lowerShape;

    public Table() {
        this.tableBills = new ArrayList<>();
        this.upperShape = "┏ - ┓";
        this.middleShape = "| " + number + " |";
        this.lowerShape = "┗ - ┛";
    }

    public int getPrice() {
        // 가격 * 수량만 리턴
        int price = 0;
        for (int i = 0; i < tableBills.size(); i++) {
            price += tableBills.get(i).getTotal();
        }

        return price;
    }

    /**
     * 네이밍 수정
     */
    public void setBill() {
        TableOrder tableOrder = new TableOrder();
        tableOrder.order("후라이드", 16000, 1);
        this.tableBills.add(tableOrder);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
