import java.util.ArrayList;
import java.util.List;

public class Table {
    private int number;
    private List<TableBills> tableBills;
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

    public void setBill() {
        TableBills tableOrder = new TableBills();
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
        this.middleShape ="| "+ number +" |";
        this.lowerShape = "┗ - ┛";
    }
}
