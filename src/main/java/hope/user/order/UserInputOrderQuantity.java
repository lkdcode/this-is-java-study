package hope.user.order;

import hope.UI.Message;
import hope.user.UserInput;
import hope.user.order.validate.UserInputOrderQuantityValidate;

import java.util.Scanner;

/**
 * @parm 주문할 매뉴의 수량을 입력받는 클래스
 */
public class UserInputOrderQuantity implements UserInput {
    private final Scanner scanner;
    private final UserInputOrderQuantityValidate userInputOrderQuantityValidate;

    public UserInputOrderQuantity() {
        this.scanner = new Scanner(System.in);
        this.userInputOrderQuantityValidate = new UserInputOrderQuantityValidate();
    }

    @Override
    public int userInput() {
        boolean isQuantity;
        String userInputOrderQuantity;
        do {
            Message.INPUT_QUANTITY.print();

            userInputOrderQuantity = scanner.nextLine();
            isQuantity = userInputOrderQuantityValidate.userInputValidate(userInputOrderQuantity);

        } while (!isQuantity);

        return Integer.parseInt(userInputOrderQuantity);

    }
}