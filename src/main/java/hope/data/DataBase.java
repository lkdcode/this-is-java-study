package hope.data;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static final DataBase instance = new DataBase();

    private List<Table> tableList = new ArrayList<>();

    private DataBase() {
        setTableList();
    }

    private void setTableList() {
        for (int i = 1; i <= 6; i++) {
            Table table = new Table();
            table.setNumber(i);
            tableList.add(table);
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


}