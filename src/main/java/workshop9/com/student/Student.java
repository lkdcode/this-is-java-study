package workshop9.com.student;

public class Student {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Student(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String studentInfo() {
        return this.name + "\t" + this.age + "\t\t" + this.height + "\t\t" + this.weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
