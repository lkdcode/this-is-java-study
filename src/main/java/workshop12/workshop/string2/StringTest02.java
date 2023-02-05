package workshop12.workshop.string2;

public class StringTest02 {
    public static void main(String[] args) {
        int money = ((int) (Math.random() * 4000001) + 1000000);
        String result = new ConvertString().convert(money);
        System.out.println(result);
    }
}
