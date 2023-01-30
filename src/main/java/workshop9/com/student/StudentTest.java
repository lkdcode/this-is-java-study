package workshop9.com.student;

public class StudentTest {
    public static void main(String[] args) {

        Student[] studentArray = new Student[3];
        studentArray[0] = new Student("홍길동", 15, 170, 80);
        studentArray[1] = new Student("한사람", 13, 180, 70);
        studentArray[2] = new Student("임걱정", 16, 175, 65);

        System.out.println("이름\t\t나이\t\t신장\t\t몸무게");

        for (Student student : studentArray) {
            System.out.println(student.studentInfo());
        }
        double avgAge = 0;
        double avgHeight = 0;
        double avgWeight = 0;

        for (Student student : studentArray) {
            avgAge += student.getAge();
            avgHeight += student.getHeight();
            avgWeight += student.getWeight();
        }

        System.out.printf("%n나이 평균 : %.3f%n", (avgAge / studentArray.length));
        System.out.printf("신장 평균 : %.3f%n", (avgHeight / studentArray.length));
        System.out.printf("몸뭄게 평균 : %.3f%n", (avgWeight / studentArray.length));

        int maxAge = studentArray[0].getAge();
        int minAge = studentArray[0].getAge();

        int maxHeight = studentArray[0].getHeight();
        int minHeight = studentArray[0].getHeight();

        int maxWeight = studentArray[0].getWeight();
        int minWeight = studentArray[0].getWeight();


        String oldestStudent = null;
        String youngestStudent = null;

        String tallestStudent = null;
        String shortestStudent = null;

        String heaviestStudent = null;
        String lightestStudent = null;

        for (int i = 1; i < studentArray.length; i++) {
            maxAge = Math.max(maxAge, studentArray[i].getAge());
            minAge = Math.min(minAge, studentArray[i].getAge());

            maxHeight = Math.max(maxHeight, studentArray[i].getHeight());
            minHeight = Math.min(minHeight, studentArray[i].getHeight());

            maxWeight = Math.max(maxWeight, studentArray[i].getWeight());
            minWeight = Math.min(minWeight, studentArray[i].getWeight());
        }

        for (int i = 0; i < studentArray.length; i++) {
            if (maxAge == studentArray[i].getAge()) {
                oldestStudent = studentArray[i].getName();
            }

            if (minAge == studentArray[i].getAge()) {
                youngestStudent = studentArray[i].getName();
            }

            if (maxHeight == studentArray[i].getHeight()) {
                tallestStudent = studentArray[i].getName();
            }

            if (minHeight == studentArray[i].getHeight()) {
                shortestStudent = studentArray[i].getName();
            }

            if (maxWeight == studentArray[i].getWeight()) {

                heaviestStudent = studentArray[i].getName();
            }

            if (minWeight == studentArray[i].getWeight()) {

                lightestStudent = studentArray[i].getName();
            }


        }
        System.out.println("\n나이가 가장 많은 학생 : " + oldestStudent);
        System.out.println("나이가 가장 적은 학생 : " + youngestStudent);
        System.out.println("신장이 가장 큰 학생 : " + tallestStudent);
        System.out.println("신장이 가장 작은 학생 : " + shortestStudent);

        System.out.println("몸무게가 가장 많이 나가는 학생 : " + heaviestStudent);
        System.out.println("몸무게가 가장 적게 나가는 학생 : " + lightestStudent);
    }
}
