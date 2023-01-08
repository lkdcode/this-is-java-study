package hope.user.pay;

import hope.data.DataBase;

/**
 * 결제금액의 할인을 관리하는 클래스
 */
public class Discount {

    /**
     * 결제금액의 할인을 적용하는 클래스
     * 치킨 종류 상관없이
     * 10개당 10,000원을 할인 적용하고
     */
    public int discount() {
        return DataBase.getInstance().getBills();
    }
}
