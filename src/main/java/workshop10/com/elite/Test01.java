package workshop10.com.elite;

public class Test01 {
    public static void main(String[] args) {
        Calc calc = new Calc();
        try {
            int number = Integer.parseInt(args[0]);

            if (!(number >= 5 && number <= 10)) {
                throw new NumberFormatException();
            }

            int result = calc.calculate(number);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("다시 입력하세요");
        }

    }
}
