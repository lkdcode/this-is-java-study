package hope.user.pay;

import hope.UI.Message;
import hope.user.UserInput;

import java.util.Scanner;

/**
 * 유저로부터 결제 방식을 입력받는 클래스
 */
public class UserInputPayment implements UserInput {

    private final Scanner scanner;
    private final UserInputPaymentValidate userInputPaymentValidate;

    public UserInputPayment() {
        this.scanner = new Scanner(System.in);
        this.userInputPaymentValidate = new UserInputPaymentValidate();
    }

    @Override
    public int userInput() {
        boolean isPayment;
        String userInputPayment;
        do {
            Message.CHOICE_PAYPAL.print();

            userInputPayment = scanner.nextLine();
            isPayment = userInputPaymentValidate.userInputValidate(userInputPayment);
        } while (!isPayment);

        return Integer.parseInt(userInputPayment);
    }
}
