public class UserInputPayValidate {

private String guestInput;


    /**
     * @parm isPay 전체적인거를 검사
     */
    public boolean isPay(String guestInput) {
        this.guestInput = guestInput;
        if (isNumber() == false) {
            return false;
        }

        if (isNumberRange() == false) {
            return false;
        }
        return true;
    }

    /**
     * @parm isNumber  숫자가 맞는지 확인해주는 메소드
     */
    private boolean isNumber() {
        try {
            Integer.parseInt(this.guestInput);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아니다");
            return false;
        }

        return true;
    }

    /**
     *  isNumberRange 1~2까지의 숫자가 들어갔는지
     */
    private boolean isNumberRange() {
        if (this.guestInput.equals("1")) {
            return true;
        } else if (this.guestInput.equals("2")) {
            return true;
        } else {
            return false;
        }


    }

}
