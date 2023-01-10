public enum ErrorMessage {
    ERROR_INPUT_TABLE("## [ERROR] 테이블 번호는 1~6 입니다.%n"),
    ERROR_INPUT_MENU_ORDER("## [ERROR] 해당 매뉴가 없습니다.%n"),
    ERROR_INPUT_NUMBER("## [ERROR] 숫자만 입력해주세요.%n"),

    ERROR_INPUT_MENU_QUANTITY("## [ERROR] 총 주문 수량은 최대 99개 입니다.%n"),
    ERROR_PAID("%n## [ERROR] 미결제건이 존재합니다.%n%n");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.printf(this.message);
    }
}
