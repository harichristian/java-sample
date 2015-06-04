package moba.string;

public class SubstringTest {
	public static void main(String[] args) {
		String t = "012345";
		String sub = t.substring(2, t.length());
		System.out.println(sub);

		String val = "0_3_1000_main1";
		String[] temp = val.split("_");
		String status = temp[0];
		String duration = temp[1];
		String price = temp[2];
		String skey = temp[3];
		System.out.println(status);
		System.out.println(duration);
		System.out.println(price);
		System.out.println(skey);
	}
}
