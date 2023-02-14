package racingcar.domain;

/**
 * 랜덤으로 번호를 생성하여 전진 조건에 맞는지 판단 후 리턴하는 클래스
 */
public class RandomMove {
    public Integer get() {
        if ((int) (Math.random() * 10) >= 4) {
            return 1;
        }
        return 0;
    }

}