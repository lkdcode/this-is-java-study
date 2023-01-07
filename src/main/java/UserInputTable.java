import java.util.Scanner;

/** 유저가 테이블을 선택할 때 입력받는 클래스
 *
 */
public class UserInputTable implements UserInput {


    private final Scanner scanner;
    private final UserInputTableValidate userInputTableValidate;

    public UserInputTable() {
        this.scanner = new Scanner(System.in);
        this.userInputTableValidate = new UserInputTableValidate();
    }

    /**
     * @parm UserInput = 유저가 테이블을 선택할 때 입력받는 역할
     */
    @Override
    public String userInput() {
        boolean isTable;

        do {
            // 입력하세요 메시지
            System.out.println("테이블 번호는 1 - 6 입니다.");
            System.out.print("테이블을 선택해주세요 : ");

            // 입력 받아서 변수에 선언
            String userInput = scanner.nextLine();

            // 입력한 값이 올바른지 유효성 검사를 해줍니다.
            isTable = userInputTableValidate.isTable(userInput);

        } while (!isTable);

        System.out.println("완료");

        return null;
    }
}
