package hope.user.order;

import hope.UI.Message;
import hope.user.UserInput;
import hope.user.order.validate.UserInputOrderMenuNumberValidate;

import java.util.Scanner;

/**
 * @parm hope.user.UserInput = 유저로부터 메뉴 주문을 입력받는 클래스
 */
public class UserInputOrderMenuNumber implements UserInput {
    private final Scanner scanner;
    private final UserInputOrderMenuNumberValidate userInputOrderMenuNumberValidate;

    public UserInputOrderMenuNumber() {
        this.scanner = new Scanner(System.in);
        this.userInputOrderMenuNumberValidate = new UserInputOrderMenuNumberValidate();
    }

    @Override
    public int userInput() {
        boolean isMenu;
        String userInputMenuNumber;

        do {
            Message.MENU_LIST.print();
            Message.INPUT_MENU.print();
            userInputMenuNumber = scanner.nextLine();
            isMenu = userInputOrderMenuNumberValidate.userInputValidate(userInputMenuNumber);
        } while (!isMenu);

        return Integer.parseInt(userInputMenuNumber);
    }
}
