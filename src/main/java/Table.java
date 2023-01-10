import java.util.ArrayList;
import java.util.List;

public class Table {
    private int number;
    private List<TableOrder> tableBills;
    private String menu;
    private  int price;
    private int quantity;
    private String upperShape;
    private String middleShape;
    private String lowerShape;

    public int getPrice() {
        //가격 * 수량 리턴D
        int price = 0;
        for (int i = 0; i < tableBills.size(); i++) {
            price += tableBills.get(i).getTotal();
        }

        return price;
    }

    public List<TableOrder> getTableBills() {
        return tableBills;
    }

    /**
     * 주문 한개당 해당 테이블이 얼마나 먹었는지 계산해주는 메소드
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

    public Table() {
        this.tableBills = new ArrayList<>();

        this.upperShape = "┏ - ┓";
        this.middleShape ="| "+ this.number +" |";
        this.lowerShape = "┗ - ┛";
    }
}
