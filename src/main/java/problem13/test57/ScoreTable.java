package problem13.test57;

public class ScoreTable {
    private String name;
    private int sol;
    private final int s;
    private int score;

    public ScoreTable(String name, int sol) {
        this.s = 20;
        this.name = name;
        this.sol = sol;
        this.score = s * sol;
    }

    @Override
    public String toString() {
        return this.name + "\t\t" + this.score;
    }
}
