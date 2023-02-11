package designpattern.builder;

public class BuilderPattern {
    public static void main(String[] ars) {
        Pokemon 피카츄 = new Pokemon.Builder(5, 5, 5).build();
        // 꼬부기는 속도가 느리다..!
        Pokemon 꼬부기 = new Pokemon.Builder(5, 5, 5).speed(0).build();
    }
}
