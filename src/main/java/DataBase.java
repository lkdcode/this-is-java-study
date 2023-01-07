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
}
