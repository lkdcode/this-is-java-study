package hope.controller;

import hope.UI.Message;
import hope.data.DataBase;

/**
 * 결제하기를 관리하는 클래스
 */
public class PayController {

    public PayController() {
    }

    public void payment() {
        DataBase.getInstance().printTable();
        Message.INPUT_TABLE.print();
        Message.CHOICE_PAYPAL.print();
        Message.BILLS.print();
        Message.PAY.print();
        Message.BILLS_HISTORY.print();
        Message.TOTAL_PAY.print();

        /**
         * 1. 결제 수단 방법을 입력 받는다
         * 2. 해당 방법으로 이동하여 결제를 진행한다
         *
         */
    }
}
