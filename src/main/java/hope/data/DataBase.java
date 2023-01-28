package hope.data;

import hope.UI.Message;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static final DataBase instance = new DataBase();

    private List<Table> tableList = new ArrayList<>();

    private DataBase() {
    }

    public void initialize() {
        setTableList();
    }

    private void setTableList() {
        for (int i = 0; i <= 6; i++) {
            tableList.add(new Table(i));
        }
    }

    public static DataBase getInstance() {
        return instance;
    }

    public Table getTable(int tableNumber) {
        return this.tableList.get(tableNumber);
    }

    public int getBills(int userTableNumber) {
        int count = 0;
        int totalPrice = 0;

        Table table = tableList.get(userTableNumber);

        for (int i = 0; i < table.getTableBills().size(); i++) {

            totalPrice += table.getTableBills().get(i).getPrice()
                    * table.getTableBills().get(i).getQuantity();

            if (table.getTableBills().get(i).getPrice() >= 10000) {
                count += table.getTableBills().get(i).getQuantity();
            }
        }
        count /= 10;
        totalPrice -= (count * 10000);

        return totalPrice;
    }

    public void getTableBills(int userTableNumber) {
        List<TableOrder> tableBills = tableList.get(userTableNumber).getTableBills();
        for (int i = 0; i < tableBills.size(); i++) {
            System.out.println(tableBills.get(i).getMenuName() + "\t\t\t"
                    + tableBills.get(i).getPrice() + "원\t\t\t"
                    + tableBills.get(i).getQuantity());
        }

    }

    public void getTableBillsTotal() {
        for (int i = 0; i < this.tableList.size(); i++) {
            List<TableOrder> tableBills = this.tableList.get(i).getTableBills();
            for (int j = 0; j < tableBills.size(); j++) {
                System.out.println(
                        "## 테이블 번호 : " + i + "\t"
                                + tableBills.get(j).getMenuName() + "\t\t\t"
                                + tableBills.get(j).getPrice() + "원\t\t\t"
                                + tableBills.get(j).getQuantity() + "개\t");
            }
        }
    }

    public boolean isPaid() {
        for (int i = 0; i < this.tableList.size(); i++) {
            if (this.tableList.get(i).getTableBills().size() >= 1) {
                return false;
            }
        }
        return true;
    }

    public void paid(int userTableNumber) {
        this.tableList.get(userTableNumber).getTableBills().clear();
    }

    public void order(int tableNumber, int menuNumber, int orderQuantity) {
        this.tableList.get(tableNumber).order(menuNumber, orderQuantity);
    }

    public void printTable() {
        StringBuilder upperShape = new StringBuilder();
        StringBuilder middleShape = new StringBuilder();
        StringBuilder lowerShape = new StringBuilder();

        for (int i = 1; i < this.tableList.size(); i++) {
            upperShape.append(this.tableList.get(i).getUpperShape());
            middleShape.append(this.tableList.get(i).getMiddleShape());
            lowerShape.append(this.tableList.get(i).getLowerShape());
        }

        Message.TABLE.print();
        System.out.println(upperShape);
        System.out.println(middleShape);
        System.out.println(lowerShape);
    }

}