package workshop12.workshop.acc;

public class Account {
    private String account;
    private double balance;
    private double interestRate;

    public Account() {

    }

    public Account(String account, double balance, double interestRate) {
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        // 현재 잔액을 기준으로 이자를 계산 한다
        // 현재 잔고 * 이자율
        return (this.balance * this.interestRate) / 100;
    }

    public void deposit(double money) throws Exception {
        // 입금을 통해 잔액 정보를 증가
        // 입금액이 0보다 적으면 Exception을 발생 시킨다.

        if (money < 0) {
            throw new Exception();
        }
    }

    public void withdraw(double money) throws Exception {
        // 출글을 통해 잔액 정보를 감소
        // 출금액이 0보다 적으면 Exception을 발생 시킨다
        // 출금액이 현재 잔액보다 많으면 Exception 을 발생 시킨다

        if (money < 0) {
            throw new Exception();
        }

        if (money > this.balance) {
            throw new Exception();
        }

    }

    public String getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
