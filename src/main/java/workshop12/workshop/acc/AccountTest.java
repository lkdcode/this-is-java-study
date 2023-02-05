package workshop12.workshop.acc;

import java.util.AbstractCollection;

public class AccountTest {
    public static void main(String[] args) {
        // 객체 생성
        // 기본 정보 출력
        // account 에 -10 입금 Exception 처리
        // account 에 60,000원 출금 Exception 처리
        // 이자 출력 - 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력 한다

        Account account;

        account = new Account("441-0290-1203", 500000, 7.3);
        System.out.println("계좌 정보 : " + account.getAccount() + " " + account.getBalance() + " " + account.getInterestRate());

        try {
            account.deposit(-10.0);
        } catch (Exception e) {
            System.out.println("입금 금액이 0보다 적습니다.");
        }

        try {
            account.withdraw(600000.0);
        } catch (Exception e) {
            System.out.println("금액이 0보다 적거나 현재 잔액보다 많습니다.");
        }

        System.out.println("이자: " + account.calculateInterest());
    }
}
