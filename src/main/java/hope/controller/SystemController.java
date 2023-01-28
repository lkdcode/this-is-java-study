package hope.controller;

import hope.UI.Message;
import hope.data.DataBase;
import hope.exception.ErrorMessage;

import java.util.Scanner;

/**
 * 메인 컨트롤러
 */
public class SystemController {
    private final OrderController orderController;
    private final PayController payController;
    private final Scanner scanner;

    public SystemController() {
        this.orderController = new OrderController();
        this.payController = new PayController();
        this.scanner = new Scanner(System.in);
        DataBase.getInstance().initialize();
    }

    public void startOfBusiness() {
        Message.MAIN.print();

        while (true) {
            Message.MENU.print();
            Message.CHOICE_MENU.print();
            int inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1:
                    orderController.order();
                    break;
                case 2:
                    payController.payment();
                    break;
                case 3:
                    if (DataBase.getInstance().isPaid()) {
                        Message.EXIT.print();
                        return;
                    }
                    ErrorMessage.ERROR_PAID.print();
                    break;
                case 4:
                    DataBase.getInstance().getTableBillsTotal();
                    break;
                default:
                    ErrorMessage.ERROR_MAIN.print();
            }
        }
    }
}
