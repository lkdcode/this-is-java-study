package workshop12.workshop.token;

import java.util.StringTokenizer;

public class StringTokenTest {
    public static void main(String[] args) {
        String str = "4,2,3,6,7";
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");

        int result = 0;

        while (stringTokenizer.hasMoreTokens()) {
            result += Integer.parseInt(stringTokenizer.nextToken());
        }

        System.out.println(result);
    }
}