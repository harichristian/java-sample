package moba.string;

/**
 * Created by hc on 4/24/15.
 */
public class EqualTest2 {
    public static void main(String[] args) {
        String test = "seleb12";
        if (!"SELEB1".equalsIgnoreCase(test) && !"VIDEO1".equalsIgnoreCase(test)) {
            test = "SELEB1";
        }
        System.out.println(test);
    }
}
