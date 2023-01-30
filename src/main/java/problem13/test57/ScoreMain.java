package problem13.test57;

public class ScoreMain {
    public static void main(String[] args) {
        ScoreTable[] scoreTables = new ScoreTable[3];
        scoreTables[0] = new ScoreTable("민들래", 5);
        scoreTables[1] = new ScoreTable("진달래", 3);
        scoreTables[2] = new ScoreTable("개나리", 0);

        System.out.println("이름\t\t\t점수");
        System.out.println("------------------");
        for (ScoreTable scoreTable : scoreTables) {
            System.out.println(scoreTable.toString());
        }

    }
}
