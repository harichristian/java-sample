package moba.string;

/**
 * Created by hc on 6/4/15.
 */
public class SubstringTest4 {
    public static void main(String[] args) {
        String keyword = "reg main2 WMID-c9eb0b20-0a6f-11e5-9e03-b50056175424 0 GAME1";
        if (keyword.toUpperCase().startsWith("REG MAIN2")) {
            String skey = keyword.toUpperCase().substring(keyword.indexOf(" ") + 1);
            System.out.println(skey);
        }
    }
}
