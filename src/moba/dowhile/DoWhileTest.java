package moba.dowhile;

/**
 * Created by hc on 1/12/15.
 */
public class DoWhileTest {
    public static void main(String[] args) {
        boolean success = false;
        boolean retry = true;

        do {
            System.out.println("TEST");
            success = false;
        } while (retry && !success);
    }
}