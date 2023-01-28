package hope.controller;

import hope.UI.Message;
import hope.data.DataBase;
import hope.user.UserInput;
import hope.user.UserInputTableNumber;
import hope.user.pay.Card;
import hope.user.pay.Cash;
import hope.user.pay.Pay;
import hope.user.pay.UserInputPayment;

/**
 * 결제하기 메뉴를 관리하는 클래스
 */
public class PayController {


    private UserInput userInput;
    private Pay pay;

    public void payment() {
        this.userInput = new UserInputTableNumber();
        // 테이블 번호를 입력해주세요
        int userTableNumber = userInput.userInput();

        // 주문 내역 보여주기
        Message.BILLS.print();
        Message.BILLS_HISTORY.print();
        DataBase.getInstance().getTableBills(userTableNumber);

        // 결제 방식 선택
        this.userInput = new UserInputPayment();
        int userPayment = userInput.userInput();

        System.out.println();
        System.out.println("## " + userTableNumber + "번 테이블의 결제를 진행합니다.");

        if (userPayment == 1) {
            pay = new Card();
        }

        if (userPayment == 2) {
            pay = new Cash();
        }

        pay.paypal(userTableNumber);
        Message.PAID.print();
    }
}
