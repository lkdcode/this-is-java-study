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


}