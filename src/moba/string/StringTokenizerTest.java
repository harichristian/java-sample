package moba.string;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String tes = "171717171";
		String a = "";
		String b = "";
		try {
			if (tes.contains(":")) {
				StringTokenizer st = new StringTokenizer(tes, ":");
				a = st.nextToken();
				b = st.nextToken();
			} else {
				a = tes;
			}
		} catch (Exception e) {
			// RM 0
			// PRICE NOT ALLOWED
		}
		System.out.println(a);
		System.out.println(b);		
	}
}
