package moba.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class XlGenerator {
	static String[] options = { "a", "b", "c", "d" };
	static String[] places = new String[options.length];
	static int count;

	public static void main(String[] args) {
		int i, j, k, m, n;
		String d1, d2, d3, d4, d5;
		String digits = "0123456789";
		String content = "";

		// First print 1-digit "numbers"
//		for (i = 0; i < 10; i++) {
//			d1 = digits.substring(i, i + 1);
////			System.out.println(d1);
//			content += d1;
//		}

		System.out.println();

		// Next, print 2-digit "numbers"
//		for (i = 0; i < 10; i++) {
//			d1 = digits.substring(i, i + 1);
//			for (j = 0; j < 10; j++) {
//				d2 = d1 + digits.substring(j, j + 1);
////				System.out.println(d2);
//				content += d2;
//			}
//		}

		System.out.println();

		// Now print 3-digit "numbers"
//		for (i = 0; i < 10; i++) {
//			d1 = digits.substring(i, i + 1);
//			for (j = 0; j < 10; j++) {
//				d2 = d1 + digits.substring(j, j + 1);
//				for (k = 0; k < 10; k++) {
//					d3 = d2 + digits.substring(k, k + 1);
////					System.out.println(d3);
//					content += d3;
//				}
//			}
//		}

		System.out.println();

		// Now print 4-digit "numbers"
//		for (i = 0; i < 10; i++) {
//			d1 = digits.substring(i, i + 1);
//			for (j = 0; j < 10; j++) {
//				d2 = d1 + digits.substring(j, j + 1);
//				for (k = 0; k < 10; k++) {
//					d3 = d2 + digits.substring(k, k + 1);
//					for (m = 0; m < 10; m++) {
//						d4 = d3 + digits.substring(m, m + 1);
////						System.out.println(d4);
//						content += d4;
//					}
//				}
//			}
//		}

		System.out.println();

		// Finally, print 5-digit "numbers"
		for (i = 0; i < 10; i++) {
			d1 = digits.substring(i, i + 1);
			for (j = 0; j < 10; j++) {
				d2 = d1 + digits.substring(j, j + 1);
				for (k = 0; k < 10; k++) {
					d3 = d2 + digits.substring(k, k + 1);
					for (m = 0; m < 10; m++) {
						d4 = d3 + digits.substring(m, m + 1);
						for (n = 0; n < 10; n++) {
							d5 = d4 + digits.substring(n, n + 1);
							System.out.println(d5);
							content = content + d5 + "\n";
						}
					}
				}
			}
		}

		try {

			File file = new File("/Users/hc/Documents/HC/XL.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static long generateRandom(int length) {
		Random random = new Random();
		char[] digits = new char[length];
		digits[0] = (char) (random.nextInt(9) + '1');
		for (int i = 1; i < length; i++) {
			digits[i] = (char) (random.nextInt(10) + '0');
		}
		return Long.parseLong(new String(digits));
	}
}
