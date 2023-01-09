package hope.controller;

import hope.data.DataBase;
import hope.user.order.UserInputOrderMenuNumber;
import hope.user.order.UserInputOrderQuantity;
import hope.user.order.UserInputOrderTable;

/**
 * 주문등록 매뉴를 관리하는 클래스
 */
public class OrderController {
    private UserInputOrderTable userInputOrderTable;
    private UserInputOrderMenuNumber userInputOrderMenuNumber;
    private UserInputOrderQuantity userInputOrderQuantity;


    public OrderController() {
        this.userInputOrderTable = new UserInputOrderTable();
        this.userInputOrderMenuNumber = new UserInputOrderMenuNumber();
        this.userInputOrderQuantity = new UserInputOrderQuantity();
    }

    public void order() {
        int userTableNumber = userInputOrderTable.userInput();
        int userOrderMenuNumber = userInputOrderMenuNumber.userInput();
        int userOrderMenuQuantity = userInputOrderQuantity.userInput();
        DataBase.getInstance().order(userTableNumber, userOrderMenuNumber, userOrderMenuQuantity);

        System.out.println(userTableNumber + "   " + userOrderMenuNumber + "     " + userOrderMenuQuantity);
    }

}
