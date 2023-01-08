package hope.UI;

/**
 * 메시지를 관리하는 클래스
 */
public enum Message {
    MAIN("## 메인화면%n"),
    MENU("1 - 주문등록%n2 - 결제하기%n3 - 프로그램 종료%n"),
    CHOICE_MENU("%n## 원하는 기능을 선택하세요.%n"),
    TABLE("## 테이블 목록%n"),
    INPUT_TABLE("테이블을 선택하세요.%n"),
    INPUT_MENU("등록할 메뉴를 선택하세요.%n"),
    INPUT_QUANTITY("메뉴의 수량을 입력하세요.%n"),
    BILLS("## 주문 내역%n"),
    BILLS_HISTORY("메뉴\t수량\t금액%n"),
    PAY("## 번 테이블의 결제를 진행합니다.%n"),
    CHOICE_PALPAY("## 신용 카드는 1번, 현금은 2번%n"),
    INPUT_PAY("## 최종 결제할 금액%n");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public void print() {
        System.out.printf(message);
    }
}