package moba.string;

/**
 * Created by hc on 1/29/15.
 */
public class SubstringTest2 {
    public static void main(String[] args) {
        String val = "{\\\"MSISDN\\\":\\\"6285817552061\\\",\\\"MO_MID\\\":\\\"5b23bc60-a76d-11e4-a05a-f988a7668eff\\\",\\\"WAP\\\":\\\"\\\",\\\"SKEY\\\":[\\\"Reg\\\"],\\\"TYPE\\\":\\\"\\\"}";
        System.out.println("BEFORE = " + val);

//        String a = val.replaceAll(":", "");
//        String a = val.substring(val.indexOf("TYPE")).replace("\"", "").replace("\\", "").replace("{", "").replace("}", "");

        String opId = "";
        try {
            opId = val.substring(val.indexOf("TYPE") + 4).replaceAll("[^\\dA-Za-z ]", "");
        } catch (Exception e) {
            opId = "ISAT";
        }

        if (!opId.equals("")) {

        }


        System.out.println("AFTER = " + opId);

    }
}
