/** 유저가 테이블을 선택할 때 입력한 값을 검증하는 클래스
 *
 */

public class UserInputTableValidate {
    private String userInput;

    public boolean isTable(String userInput) {
        this.userInput = userInput;

        if (!isNumber()) {
            return false;
        }

        if (!isNumberRange()) {
            return false;
        }

        return true;
    }

    private boolean isNumber() {
        try {
            Integer.parseInt(this.userInput);
        } catch (NumberFormatException e) {
            System.out.println("테이블 번호는 1-6입니다.");
            return false;
        }
        return true;
    }

    private boolean isNumberRange() {
        if (this.userInput.matches("^[1-6]*$") && this.userInput.length() == 1) {
            System.out.println("테이블 번호는 1-6입니다.");
            return true;
        }
        return false;
    }

}
