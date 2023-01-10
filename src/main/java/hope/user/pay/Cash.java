package hope.user.pay;

import hope.UI.Message;
import hope.data.DataBase;

import java.util.Scanner;

/**
 * 현금 결제를 담당하는 클래스
 */
public class Cash implements Pay {
    private final Scanner scanner;

    public Cash() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void paypal(int userTableNumber) {
        int totalPrice = (int) ((DataBase.getInstance().getBills(userTableNumber)) * 0.95);

        int userPay;
        System.out.println("## 총 결제 금액 : " + totalPrice);
        Message.PAYMENT_CASH.print();

        do {
            System.out.print("## 결제하실 금액을 입력해주세요 : ");

            userPay = this.scanner.nextInt();
        } while (!(userPay == totalPrice));

        DataBase.getInstance().paid(userTableNumber);
    }
}