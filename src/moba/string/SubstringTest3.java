package moba.string;

/**
 * Created by hc on 5/27/15.
 */
public class SubstringTest3 {
    public static void main(String[] args) {
        String test = "REG CHAT5";
//        System.out.println(test.toUpperCase().substring(test.indexOf(" ") + 1));

        if (test.toUpperCase().contains("CHAT")) {
            System.out.println("BENAR");
        }

        String[] parts = null;
        if (test.toUpperCase().contains(" ")) {
            System.out.println("1");
            parts = test.split(" ");
        } else if ("+".contains(test)) {
            parts = test.split("\\+");
        } else if ("-".contains(test)) {
            parts = test.split("-");
        }

        String prefix = parts[0];
        String keyword = parts[1];

        System.out.println(prefix);
        System.out.println(keyword);
    }
}
