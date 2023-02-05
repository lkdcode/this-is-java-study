package workshop12.workshop.stringbuffer;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("LGCNS");
        String str = null;

        str = sb.substring(0, 2);
        str += sb.substring(2, 5).toLowerCase() + "er";

        System.out.println(str);
    }
}
