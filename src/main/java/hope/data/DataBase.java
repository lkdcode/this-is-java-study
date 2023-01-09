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
        for (int i = 1; i <= 6; i++) {
            tableList.add(new Table(i));
        }
    }

    public static DataBase getInstance() {
        return instance;
    }

    public Table getTable(int tableNumber) {
        return this.tableList.get(tableNumber - 1);
    }

    public int getBills() {
        int tableNumber = 1;
        int count = 0;
        int totalPrice = 0;

        Table table = tableList.get(tableNumber);

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

    public void getTableBills() {
        for (int i = 0; i < tableList.size(); i++) {
            List<TableOrder> tableBills = tableList.get(i).getTableBills();
            Table table = tableList.get(i);
            for (int j = 0; j < tableBills.size(); j++) {
                System.out.println(table.getNumber() + "번 테이블 \t"
                        + tableBills.get(j).getMenuName() + "\t"
                        + tableBills.get(j).getPrice() + "원 \t"
                        + tableBills.get(j).getQuantity() + "<수량");
            }
        }
    }

    public boolean isPaid() {
        if (tableList.get(0).getTableBills().size() >= 1) {
            return false;
        }
        return true;
    }

    public void paid() {
        /**
         * 1. tableList 에 접근하여 리스트를 가져온다
         * 2. 조건에 부합하면 삭제한다
         *
         * 1. 테이블을 보여주고 테이블 번호를 입력받는다.
         * 2. 주문내역을 보여주고 결제 수단을 입력받는다.
         * 3. 최종 결제할 금액을 입력받는다
         * 4. 최종 결제 금액과 주문내역의 금액이 일치하면 삭제한다
         */

        this.tableList.get(0).getTableBills().clear();

    }

    public void order(int tableNumber, int menuNumber, int orderQuantity) {
        tableList.get(tableNumber - 1).order(menuNumber, orderQuantity);
    }

    public void printTable() {
        StringBuilder upperShape = new StringBuilder();
        StringBuilder middleShape = new StringBuilder();
        StringBuilder lowerShape = new StringBuilder();

        for (int i = 0; i < tableList.size(); i++) {
            upperShape.append(tableList.get(i).getUpperShape());
            middleShape.append(tableList.get(i).getMiddleShape());
            lowerShape.append(tableList.get(i).getLowerShape());
        }
        Message.TABLE.print();
        System.out.println(upperShape);
        System.out.println(middleShape);
        System.out.println(lowerShape);
    }

}