package moba.string;

/**
 * Created by hc on 2/13/15.
 */
public class PixelTest {
    public static void main(String[] args) {
        int curr = 6;
        int start = 2;
        int end = 5;
        boolean fire = false;
        if (curr > start && curr <= end) {
            fire = false;
        } else {
            fire = true;
        }

        System.out.println("FIRE = " + fire);
    }
}
