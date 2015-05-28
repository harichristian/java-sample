package moba.map;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("11", "1");
		map.put("12", "2");
		map.put("13", "3");
		map.put("14", "4");
		
		System.out.println(map.keySet() + "" + map.values());
	}
}
