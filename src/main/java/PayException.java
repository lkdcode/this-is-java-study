/**
 * 결제 실패 익셉션
 */

public class PayException extends Exception {
    public PayException(String message) {
        super(message);
    }

}
