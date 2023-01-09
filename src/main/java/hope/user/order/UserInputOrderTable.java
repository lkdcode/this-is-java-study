package hope.user.order;

import hope.UI.Message;
import hope.data.DataBase;
import hope.user.UserInput;
import hope.user.order.validate.UserInputTableNumberValidate;

import java.util.Scanner;

/**
 * 유저가 테이블 넘버를 입력받는 클래스
 */
public class UserInputOrderTable implements UserInput {
    private final Scanner scanner;
    private final UserInputTableNumberValidate userInputTableValidate;

    public UserInputOrderTable() {
        this.scanner = new Scanner(System.in);
        this.userInputTableValidate = new UserInputTableNumberValidate();
    }

    @Override
    public int userInput() {
        boolean isTable;
        String userInputTableNumber;
        do {
            DataBase.getInstance().printTable();
            Message.INPUT_TABLE.print();
            userInputTableNumber = scanner.nextLine();
            isTable = userInputTableValidate.userInputValidate(userInputTableNumber);
        } while (!isTable);

        return Integer.parseInt(userInputTableNumber);
    }

}