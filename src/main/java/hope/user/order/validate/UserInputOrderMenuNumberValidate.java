package hope.user.order.validate;

import hope.exception.ErrorMessage;
import hope.user.UserInputTableNumberValidate;

public class UserInputOrderMenuNumberValidate extends UserInputTableNumberValidate {
    private final String MENU = "^[1-6]*$";
    private final int COKE = 21;
    private final int SPRITE = 22;
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
            ErrorMessage.ERROR_INPUT_MENU_ORDER.print();
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
        if (userInput.length() > 2) {
            return false;
        }

        if (userInput.length() == 1) {
            if (!(userInput.matches(MENU))) {
                return false;
            }
        }

        if (userInput.length() == 2) {
            if (!(Integer.parseInt(this.userInput) == COKE
                    || Integer.parseInt(this.userInput) == SPRITE)) {
                return false;
            }
        }

        return true;
    }

}
