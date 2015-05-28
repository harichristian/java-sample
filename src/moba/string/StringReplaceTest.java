package moba.string;

/**
 * Created by hc on 1/20/15.
 */
public class StringReplaceTest {
    public static void main(String[] args) {
        String t = "7483784834783:";
        System.out.println("BEFORE = " + t);

        t = t.replace(":","");
        System.out.println("AFTER = " + t);
    }
}
