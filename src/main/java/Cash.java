import java.util.Scanner;

public class Cash extends Discount implements Pay {
    private final static int TABLE_NUMBER = 1;

/**
 * 캐쉬로 결제를 하게끔 만들어주는 메소드
 */
    @Override
    public void paypal() { //메소드 1개능 기능 1
//        테이블 주무내역 가져오기
        Table table = DataBase.getInstance().getTableList(TABLE_NUMBER);
        TableOrder tableBills = new TableOrder();
        // 메뉴, 수량, 가격
        table.setBill();
        table.setBill();


        // 할인율 적용하기 -> 10개 이상 주문시 만원 할인
        // 주문내역의 치킨 수량의 합 -> ex) n / 10 = 1 * 10,000  -> bills의 가격을 깍아준다

//        if (tableBills.getTotal() == table.getPrice()) {
//
//        }

        // 그 값을 결제하기
        System.out.println(table.getPrice());
        //입력받은 값이  getprice랑 같냐 라는걸 물어보기
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

//    public void  stepOne() {
//    }
//
//    public void step2() {
//
//    }
/**
 *현찰을 내면 5프로를 디스카운트 해주는 메소드
 */
    @Override
    public void discount() {
        super.discount(); // 1만원 디스카운트
        // ... 5프로 디스카운트
 // 현찰을 내면 5프로 디스카운트 하는 메소드
        super.discountFivePercent();
    }
}
