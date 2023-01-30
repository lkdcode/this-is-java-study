package workshop10.com.month;

public class Months {
    public int getDays(int months) {
        switch (months) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 28;
        }
    }
}
