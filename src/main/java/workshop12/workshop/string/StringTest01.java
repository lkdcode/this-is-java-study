package workshop12.workshop.string;

public class StringTest01 {
    public static void main(String[] args) {
        String str = "I am second to none";

        String resultString = str.replace(" ", "");
        String[] resultWord = str.split(" ");

        for (int i = 0; i < resultString.length(); i++) {
            System.out.print(resultString.charAt(i) + " ");
        }
        System.out.println("문자 개수 : " + resultString.length());

        for (int i = 0; i < resultWord.length; i++) {
            System.out.print(resultWord[i] + " ");
        }
        System.out.println("단어개수 : " + resultWord.length);
    }
}
