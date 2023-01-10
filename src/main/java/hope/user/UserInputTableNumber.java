package hope.user;

import hope.UI.Message;
import hope.data.DataBase;

import java.util.Scanner;

/**
 * 유저로부터 테이블 넘버를 입력받는 클래스
 */
public class UserInputTableNumber implements UserInput {
    private final Scanner scanner;
    private final UserInputTableNumberValidate userInputTableNumberValidate;

    public UserInputTableNumber() {
        this.scanner = new Scanner(System.in);
        this.userInputTableNumberValidate = new UserInputTableNumberValidate();
    }

    @Override
    public int userInput() {
        boolean isTable;
        String userInputTableNumber;
        do {
            DataBase.getInstance().printTable();
            Message.INPUT_TABLE.print();
            userInputTableNumber = scanner.nextLine();
            isTable = userInputTableNumberValidate.userInputValidate(userInputTableNumber);
        } while (!isTable);

        return Integer.parseInt(userInputTableNumber);
    }

}