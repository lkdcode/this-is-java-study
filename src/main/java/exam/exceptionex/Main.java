package exam.exceptionex;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String testWord = "a";

        try {
            main.changeNumber(testWord);
        } catch (UserException e) {
            System.out.println(e);
        }
    }

    private int changeNumber(String changeWord) throws UserException {
        try {
            return Integer.parseInt(changeWord);
        } catch (NumberFormatException e) {
            throw new UserException("커스텀 익셉션 발생!");
        }
    }
}
