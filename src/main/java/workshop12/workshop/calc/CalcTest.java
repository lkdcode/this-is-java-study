package workshop12.workshop.calc;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        double result = 0;

        switch (args[1]) {
            case "+":
                result = calculator.plus(a, b);
                break;
            case "-":
                result = calculator.minus(a, b);
                break;
            case "x":
                result = calculator.multiplication(a, b);
                break;
            case "/":
                result = calculator.divide(a, b);
                break;
        }

        System.out.println("결과: " + result);
    }
}
