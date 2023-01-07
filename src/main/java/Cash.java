import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cash implements Pay {


/**
 * 캐쉬로 결제를 하게끔 만들어주는 메소드
 */
    @Override
    public void paypal() {
        //테이블 주무내역 가져오기
        int tableNumber = 1;
        Table table = DataBase.getInstance().getTableList(tableNumber);
        // 메뉴, 수량, 가격
        table.setBill();
        table.setBill();


        // 할인율 적용하기 -> 10개 이상 주문시 만원 할인
        // 주문내역의 치킨 수량의 합 -> ex) n / 10 = 1 * 10,000  -> bills의 가격을 깍아준다


        // 그 값을 결제하기
        System.out.println(table.getPrice());
        //입력받은 값이  getprice랑 같냐
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("결제하실 금액을 입력해 주세요");
        int input = scanner.nextInt();

        if (table.getPrice() == input) {
            System.out.println("결제완료");
        } else {
            while (!(table.getPrice() == input)) {
                System.out.println("결제가 완료되지 않았습니다 다시 입력해주세요");
                input = scanner.nextInt();
            }
        }
        table.getPrice();
    }

}
