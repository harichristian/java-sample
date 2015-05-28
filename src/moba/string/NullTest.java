package moba.string;

/**
 * Created by hc on 2/28/15.
 */
public class NullTest {
    public static void main(String[] args) {
        String t = "test";
        if (t == null || "".equalsIgnoreCase(t)) {
            System.out.println("NULL OR BLANK");
        } else {
            System.out.println("NOT");
        }

        System.out.println();
    }
}
