package moba.string;

public class SubstringTest {
	public static void main(String[] args) {
		String t = "012345";
		String sub = t.substring(2, t.length());
		System.out.println(sub);

		String t2 = "0_3";
		String status = t2.substring(0, t2.indexOf("_"));
		String duration = t2.substring(2, t2.length());
		System.out.println(status);
		System.out.println(duration);
	}
}
