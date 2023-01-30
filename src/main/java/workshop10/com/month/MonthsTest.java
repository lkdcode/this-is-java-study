package workshop10.com.month;

public class MonthsTest {
    public static void main(String[] args) {
        Months months = new Months();
        try {
            int month = Integer.parseInt(args[0]);

            if (!(month >= 1 && month <= 12)) {
                throw new NumberFormatException();
            }

            int lastDay = months.getDays(month);

            System.out.println("입력 받은 월 : " + month + "월");
            System.out.println("마지막 일자 : " + lastDay + "일");
        } catch (NumberFormatException e) {
            System.out.println("입력된 값이 잘못 되었습니다.");
        }

    }
}
