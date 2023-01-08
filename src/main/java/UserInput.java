import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface UserInput {

    String userInput() throws IOException;

    /**
     *
     * @parm userinput 유저가 주문할때 입력받는 값
     */
}
