package hope.controller;

import hope.data.DataBase;
import hope.user.UserInput;
import hope.user.order.UserInputOrderMenuNumber;
import hope.user.order.UserInputOrderQuantity;
import hope.user.order.UserInputOrderTable;

/**
 * 주문등록 매뉴를 관리하는 클래스
 */
public class OrderController {
    private UserInput userInput;

    public void order() {
        this.userInput = new UserInputOrderTable();
        int userTableNumber = userInput.userInput();
        this.userInput = new UserInputOrderMenuNumber();
        int userOrderMenuNumber = userInput.userInput();
        this.userInput = new UserInputOrderQuantity();
        int userOrderMenuQuantity = userInput.userInput();
        DataBase.getInstance().order(userTableNumber, userOrderMenuNumber, userOrderMenuQuantity);
    }

}
