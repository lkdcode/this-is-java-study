package workshop8.workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("부서 별 점수를 입력해주세요 : ");
        String input = bufferedReader.readLine();
        String[] inputSplit = input.split(" ");

        double A;
        double B;
        double C;
        double D;
        double E;

        while (true) {

            while (true) {
                if (inputSplit.length != 5) {
                    System.out.print("다시 입력하세요 : ");
                    input = bufferedReader.readLine();
                    inputSplit = input.split(" ");
                } else {
                    break;
                }
            }

            try {
                A = Integer.parseInt(inputSplit[0]);
                B = Integer.parseInt(inputSplit[1]);
                C = Integer.parseInt(inputSplit[2]);
                D = Integer.parseInt(inputSplit[3]);
                E = Integer.parseInt(inputSplit[4]);
                break;
            } catch (NumberFormatException e) {
                System.out.print("다시 입력하세요 : ");
                input = bufferedReader.readLine();
                inputSplit = input.split(" ");
            }
        }

        double score = (((A + B) / 2) * 0.6) + (((C + D) / 2) * 0.2) + (E * 0.2);

        String scoreClass;

        if (score >= 90) {
            scoreClass = "Gold Class";
        } else if (score >= 80) {
            scoreClass = "Silver Class";
        } else if (score >= 70) {
            scoreClass = "Bronze Class";
        } else {
            scoreClass = "Normal Class";
        }

        System.out.println("평가 점수 : " + score + "점");


        System.out.println("Class : " + scoreClass);
    }
}
