package hope.UI;

/**
 * 메시지를 관리하는 클래스
 */
public enum Message {
    MAIN("## 메인화면%n"),
    MENU("1 - 주문등록%n2 - 결제하기%n3 - 프로그램 종료%n"),
    CHOICE_MENU("%n## 원하는 기능을 선택하세요.%n"),
    TABLE("%n## 테이블 목록%n"),
    INPUT_TABLE("%n## 테이블을 선택하세요.%n"),
    INPUT_MENU("%n## 등록할 메뉴를 선택하세요.%n"),
    INPUT_QUANTITY("%n## 메뉴의 수량을 입력하세요.%n"),
    BILLS("## 주문 내역%n"),
    BILLS_HISTORY("-- 메뉴\t\t\t\t수량\t\t\t\t금액%n --"),
    PAY("## 번 테이블의 결제를 진행합니다.%n"),
    CHOICE_PAYPAL("## 신용 카드는 1번, 현금은 2번%n"),
    TOTAL_PAY("## 최종 결제할 금액%n"),
    MENU_LIST("%n[치킨] 1 - 후라이드 : 16000원 %n" +
            "[치킨] 2 - 양념치킨 : 16000원%n" +
            "[치킨] 3 - 반반치킨 : 16000원%n" +
            "[치킨] 4 - 통구이 : 16000원%n" +
            "[치킨] 5 - 간장치킨 : 17000원%n" +
            "[치킨] 6 - 순살치킨 : 17000원%n" +
            "[음료] 21 - 콜라 : 1000원%n" +
            "[음료] 22 - 사이다 : 1000원%n"),
    EXIT("%n## 프로그램을 종료합니다.");
    private final String message;

    Message(String message) {
        this.message = message;
    }

    public void print() {
        System.out.printf(message);
    }
}