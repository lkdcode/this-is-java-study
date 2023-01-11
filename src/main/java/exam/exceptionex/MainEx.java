package exam.exceptionex;

public class MainEx {
    public static void main(String[] args) {
        String word = "A";
        try {
            int changeNumber = Integer.parseInt(word);
        } catch (NumberFormatException e) {
            System.out.println("익셉션 발생");
        }
    }
}
