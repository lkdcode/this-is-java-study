package exam.enumex;

public enum Message {
    HELLO("안녕하세요");
    private final String message;

    Message(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(this.message);
    }
}
