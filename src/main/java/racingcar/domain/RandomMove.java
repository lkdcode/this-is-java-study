package racingcar.domain;

/**
 * 랜덤으로 번호를 생성하여 전진 조건에 맞는지 판단 후 리턴하는 클래스
 * TODO :
 * 랩핑, 싱글톤
 */
public class RandomMove {
    private static RandomMove instance;
    private int runnable = 4;
    private int stop = 0;
    private int go = 1;

    public static RandomMove getInstance() {
        if (instance == null) {
            instance = new RandomMove();
        }
        return instance;
    }

    public int move() {
        if ((int) (Math.random() * 10) >= runnable) {
            return go;
        }
        return stop;
    }
}