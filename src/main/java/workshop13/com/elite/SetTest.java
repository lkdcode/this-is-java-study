package workshop13.com.elite;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Character> result = new HashSet<>();

        for (int i = 0; i < args[0].length(); i++) {
            result.add(args[0].charAt(i));
        }

        System.out.println(result);

    }

}
