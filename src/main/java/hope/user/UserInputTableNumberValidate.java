package hope.user;


import hope.exception.ErrorMessage;

/**
 * 유저로부터 입력받은 테이블 넘버를 검증하는 클래스
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

