package hope.user.order.validate;


import hope.exception.ErrorMessage;

/**
 * 유저가 테이블을 선택할 때 입력한 값을 검증하는 클래스
 */

public class UserInputTableNumberValidate {
    private final String NUMBER = "^[1-6]*$";
    private final int NUMBER_RANGE = 1;
    protected String userInput;


    public boolean userInputValidate(String userInput) {
        this.userInput = userInput;
        if (!isNumber()) {
            ErrorMessage.ERROR_INPUT_TABLE.print();
            return false;
        }

        if (!isNumberRange()) {
            ErrorMessage.ERROR_INPUT_TABLE.print();
            return false;
        }

        return true;
    }

    protected boolean isNumber() {
        try {
            Integer.parseInt(this.userInput);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    protected boolean isNumberRange() {
        if (this.userInput.matches(NUMBER) && this.userInput.length() == NUMBER_RANGE) {
            return true;
        }
        return false;
    }


}

