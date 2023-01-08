import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputPayWay implements UserInput{ // 카드1 를 선택하냐 캐쉬(2)를 선택하냐
    private  final UserInputPayValidate userInputPayValidate;

    public UserInputPayWay() {
        this.userInputPayValidate = new UserInputPayValidate();
    }






    @Override
    public String userInput() throws IOException {
        boolean isCardOrMoney;
        do {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("결제방식을 선택해 주세요");
            System.out.println("1 = 카드");
            System.out.println("2 = 현금");

            String guestInput = bufferedReader.readLine();

            isCardOrMoney = userInputPayValidate.isPay(guestInput);
        }
        while (!isCardOrMoney);

            System.out.println("완료");

        return null;
    }
}
