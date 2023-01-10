package hope.user.pay;

import hope.exception.ErrorMessage;
import hope.user.UserInputTableNumberValidate;


/**
 * 유저로부터 입력받은 결제 방식의 값이 유효한지 검증하는 클래스
 */
public class UserInputPaymentValidate extends UserInputTableNumberValidate {

    private String userInput;

    public boolean userInputValidate(String userInputPayment) {
        this.userInput = userInputPayment;
        super.userInput = this.userInput;
        if (!isNumber()) {
            ErrorMessage.ERROR_INPUT_PAYMENT.print();
            return false;
        }

        if (!isNumberRange()) {
            ErrorMessage.ERROR_INPUT_PAYMENT.print();
            return false;
        }

        return true;
    }

    @Override
    protected boolean isNumber() {
        return super.isNumber();
    }

    @Override
    protected boolean isNumberRange() {
        if (userInput.length() != 1) {
            return false;
        }
        if (!(userInput.equals("1") || userInput.equals("2"))) {
            return false;
        }
        return true;
    }
}
