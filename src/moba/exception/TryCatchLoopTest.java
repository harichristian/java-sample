package moba.exception;


public class TryCatchLoopTest {
	public static void main(String[] args) {
		boolean connected = false;
		while (!connected) {
			try {
				System.out.println("try to connect ...");
				String s = "";
				s.trim();
				
				connected = true;
				System.out.println("connected");
			} catch (Exception e) {
				connected = false;
			}
    	}
	}
}
