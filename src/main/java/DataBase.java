import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static final DataBase instance = new DataBase();
    private static final int indexNumber = 1;

    private List<Table> tableList = new ArrayList<>();


    private DataBase() {
        setTableList();
    }

    public static DataBase getInstance() {
        return instance;
    }

    private void setTableList() {
        for (int i = 1; i <= 6; i++) {
            Table table = new Table();
            table.setNumber(i);
            tableList.add(table);
        }
    }

    public Table getTableList(int tableNumber) {
        return this.tableList.get(tableNumber - indexNumber);
    }

    public int  getBills() {
        int count = 0;
        int tableNumber = 1;
        int totalPrice = 0;

       Table table = tableList.get(tableNumber);

        for (int i = 0; i <table.getTableBills().size(); i++) {
            totalPrice += table.getTableBills().get(i).getPrice() * table.getTableBills().get(i).getQuantity();
            if (table.getTableBills().get(i).getPrice() >= 10000) {
                count += table.getTableBills().get(i).getQuantity();
            }
        }

        count /= 10;
        totalPrice -= (count * 10000);

        return totalPrice;
    }


    public double getDiscount() {
        double discountPercent = 0.05 ;
        getBills();

        return getBills() * discountPercent;
    }
}
