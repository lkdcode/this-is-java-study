package hope.user.order.validate;

import hope.exception.ErrorMessage;

public class UserInputOrderQuantityValidate extends UserInputTableNumberValidate {
    private final int MIN_ORDER = 1;
    private final int MAX_ORDER = 99;
    private String userInput;

    @Override
    public boolean userInputValidate(String userInput) {
        this.userInput = userInput;
        super.userInput = this.userInput;

        if (!isNumber()) {
            ErrorMessage.ERROR_INPUT_NUMBER.print();
            return false;
        }

        if (!isNumberRange()) {
            ErrorMessage.ERROR_INPUT_MENU_QUANTITY.print();
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
        if (Integer.parseInt(this.userInput) < MIN_ORDER
                || Integer.parseInt(this.userInput) > MAX_ORDER) {
            return false;
        }
        return true;
    }
}
