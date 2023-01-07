import java.util.Scanner;

public class Card implements Pay {
/** 카드 결제를 담당하는 클래스
 *
 */

    @Override
    public void paypal() {
        // 테이블의 주문내역을 가져오기
        int tableNumber = 1;
        Table table = DataBase.getInstance().getTable(tableNumber);
        // userInpu 을 통해서 생성;
        table.setBill();
        table.setBill();
        // 매뉴 , 수량 , 가격

        // 할인을 적용하기
        // 주문내역의 치킨 수량을 취합 -> ( n / 10 ) * 10000  => bills 가격을


        // 그 값을 결제하기
        Scanner scanner = new Scanner(System.in);
        int userPay;
        System.out.println("총 결제 금액 : " + table.getPrice());

        do {
            System.out.print("결제하실 금액을 입력해주세요 : ");
            userPay = scanner.nextInt();
        } while (!(userPay == table.getPrice()));

        System.out.println("결제 완료");

    }


}
