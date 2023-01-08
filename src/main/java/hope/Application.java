package hope;

import hope.controller.SystemController;

public class Application {
    private static final SystemController systemController = new SystemController();

    public static void main(String[] args) {
        System.out.println("hello world");
        systemController.startOfBusiness();
    }
}