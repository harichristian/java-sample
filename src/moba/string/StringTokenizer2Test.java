package moba.string;

import java.util.StringTokenizer;

/**
 * Created by hc on 1/16/15.
 */
public class StringTokenizer2Test {
    public static void main(String[] args) {
        String serviceInfo = "31510148015007:";
        String indosat_scode = "";
        String indosat_sdmcode = "";

        try {
            if (serviceInfo.contains(":")) {
                System.out.println("contain :");
                StringTokenizer st = new StringTokenizer(serviceInfo, ":");
                indosat_scode = st.nextToken();
                indosat_sdmcode = st.nextToken();
            } else {
                System.out.println("tidak contain :");
                indosat_scode = serviceInfo;
            }
            System.out.println(indosat_scode);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
