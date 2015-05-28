package moba.classloader;

import moba.hostname.HostTest;

public class SystemClassLoaderTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		System.out.println(cl);
		
		try {
			Class<HostTest> ht = (Class<HostTest>) cl.loadClass("moba.hostname.HostTest");
			System.out.println(ht.getName());
			
			HostTest ht2 = (HostTest) Class.forName("moba.hostname.HostTest").newInstance();
			System.out.println(ht2.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
