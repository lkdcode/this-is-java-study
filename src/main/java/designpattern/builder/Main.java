package designpattern.builder;

public class Main {
    public static void main(String[] args) {
        Grade grade = Grade.of(100);

        System.out.println(grade.getClass());

////////////////////////////////////////////////////////////

        Pokemon 피카츄 = new Pokemon.Builder(5, 5, 5).build();
        // 꼬부기는 속도가 느리다..!
        Pokemon 꼬부기 = new Pokemon.Builder(5, 5, 5).speed(0).build();










        String s1 = new String("문자열");
        String s2 = new String("문자열");
        String s3 = "문자열";
        String s4 = String.valueOf("문자열");

// 동일성 비교
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println((Boolean.TRUE== true) +"???????");
// 동등성 비교
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));

    }







}


class Pokemon {
    private final int attack, defense, hp, speed;

    static class Builder {
        private final int attack, defense, hp; // 필수 매개변수
        private int speed = 5; // 선택 매개변수 - 기본값으로 초기화

        public Builder(int attack, int defense, int hp) {
            this.attack = attack;
            this.defense = defense;
            this.hp = hp;
        }

        public Builder speed(int val) {
            speed = val;
            return this;
        }

        public Pokemon build() {
            return new Pokemon(this);
        }
    }

    private Pokemon(Builder builder) {
        attack = builder.attack;
        defense = builder.defense;
        hp = builder.hp;
        speed = builder.speed;
    }
}


class Grade {
    public static Grade of(int score) {
        if (score == 100) {
            return new Perfect();
        } else if (score > 80) {
            return new Good();
        } else {
            return new Soso();
        }
    }

}

class Perfect extends Grade {
};

class Good extends Grade {
};

class Soso extends Grade {
};





