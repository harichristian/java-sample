package moba.object;

import java.util.Iterator;
import java.util.TreeSet;


public class ComparisonTest {
	public ComparisonTest() {
		ComparisonTest("MAX");
	}
	
	public ComparisonTest(String A) {
		System.out.println("A");
	}
	
	public void ComparisonTest(String B) {
		System.out.println("B");
	}
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println(e.toString());
		}
	}
	
	class MyException1 extends Exception {}
	class MyException2 extends MyException1 {}
	abstract class GenericNumber {
		private String digits;
		private int base;
		
		public GenericNumber(int base) {
			this.base = base;
			System.out.println("gen num");
		}
		
		public void setDigits(String digits) {
			this.digits = digits;
		}
		
		public abstract int toBase10();
	}
}
