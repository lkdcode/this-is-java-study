package hope.user.pay;

import hope.data.Table;
import hope.data.DataBase;

import java.util.Scanner;

public class Card extends Discount implements Pay {

    /**
     * 카드 결제를 담당하는 클래스
     */
    @Override
    public void paypal() {
        int tableNumber = 1;
        Table table = DataBase.getInstance().getTable(tableNumber);

        int totalPrice = discount();
        Scanner scanner = new Scanner(System.in);
        int userPay;
        System.out.println("총 결제 금액 : " + table.getPrice());

        do {
            System.out.print("결제하실 금액을 입력해주세요 : ");
            userPay = scanner.nextInt();
        } while (!(userPay == table.getPrice()));

        System.out.println("결제 완료");

    }

    @Override
    public int discount() {
        return super.discount();
    }


}
