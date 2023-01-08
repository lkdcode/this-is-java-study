package hope.controller;

import java.util.Scanner;

/**
 * 메인 컨트롤러
 */
public class SystemController {
    private final OrderController orderController;
    private final PayController payController;

    public SystemController() {
        this.orderController = new OrderController();
        this.payController = new PayController();
    }

    public void startOfBusiness() {
        //-- enum Message 를 사용하여 아래의 메시지를 출력 --//
        // ## 메인화면
        // 1 - 주문등록
        // 2 - 결제하기
        // 3 - 프로그램 종료
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 : ");
        String inputNumber = scanner.nextLine();


        switch (inputNumber) {
            case "1":
                System.out.println("주문등록 메뉴 실행");
                break;
            case "2":
                System.out.println("결제하기 메뉴 실행");
                break;
            case "3":
                System.out.println("프로그램 종료");
                break;
            default:
                System.out.println("다시 입력");
                break;
        }

    }
}
