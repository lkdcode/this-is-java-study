package pokemon.life.pokemon;

public class Chicorita extends Pokemon{
    public Chicorita() {
        super("치코리타", 100, Type.GRASS);
    }

    @Override
    public void skill1(Pokemon pokemon) {
        useSkill("(나) %s(이)가 스킬1을 사용했습니다.\n", pokemon, 10);
    }

    @Override
    public void skill2(Pokemon pokemon) {
        useSkill("(나) %s(이)가 스킬2을 사용했습니다.\n", pokemon, 20);
    }

    @Override
    public void skill3(Pokemon pokemon) {
        useSkill("(나) %s(이)가 스킬3을 사용했습니다.\n", pokemon, 30);
    }

    private void useSkill(String format, Pokemon pokemon, int damage) {
        System.out.printf(format, this.getName());
        pokemon.setHp(pokemon.getHp() - damage);
        System.out.printf("(상대) %s의 남은 체력 : %d\n", pokemon.getName(), pokemon.getHp());
    }
}