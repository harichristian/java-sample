package moba.gson;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.util.Map.Entry;

public class GsonTest {

	public static void main(String[] args) {

		String s = "{ \"operator_id\" : \"XL\""
				+ "  , \"campaign_id\" : 9"
				+ "  , \"data\" : {"
				+ "\"papa:log.php:10:1\" : \"baruhit\""
				+ ", \"papa:forward.php:20:1\" : \"baruhitlagi\""
				+ ", \"kilo:visit.php:13:1\" : \"baruhit\""
				+ ", \"kilo:visit.php:13:1\" : \"baruhit\""
				+ ", \"oscar:wap.js:process_dr:56:1\" : \"baruhit\""
				+ ", \"oscar:plugin_sender.jar:ModMessageSmsIn:22:1\" : \"baruhit\""
				+ "}" + "  }";
		
		System.out.println("ORIGINAL JSON STRING");
		System.out.println(s);
		System.out.println();
		
		
    	String newEntryKey = String.format("%s:%s:%s:%s", "oscar", "plugin_sender.jar", "ModMessageSmsIn", "22", "");
        try
        {
        	Gson gson = new Gson();
        	JsonObject trackerObj =  gson.fromJson(s, new TypeToken<JsonObject>(){}.getType());
        	JsonObject data = trackerObj.has("data") ? trackerObj.get("data").getAsJsonObject() : new JsonObject();
        	
        	boolean found = false;
        	int sequence = 0;
        	
        	for (Entry<String, JsonElement> entry : data.entrySet()) {
        		String key = entry.getKey();
        		JsonElement value = entry.getValue();
        		
        		String keyWithoutLineNumber = key.substring(0, key.lastIndexOf(":"));
        		
        		if(newEntryKey.equals(keyWithoutLineNumber)) {
        			found = true;
        			
        			sequence = Integer.parseInt(key.substring(key.length() - 1, key.length()));
        			sequence += 1;
					
					break;
        		} else {
//        			newEntryKey = newEntryKey + ":" + 0;
        		}
        	}
        	
        	newEntryKey = newEntryKey + ":" + sequence;
//        	if ( found ) {
//        		newEntryKey = newEntryKey + ":" + sequence;
//        	} else {
//        		
//        	}
        	
        	data.addProperty(newEntryKey, "MARKER");
        	trackerObj.remove("data");
        	trackerObj.add("data", data);
        	
        	System.out.println("NEW");
        	System.out.println(trackerObj.toString());
        } catch ( Exception e) {
        }
        
        
        
		// Logic utk nambahin tracker log ke sub structure. uda bisa
//		Map<String, Object> parent = (new Gson()).fromJson(s, new TypeToken<Map<String, Object>>() {}.getType());
//		String searchKey = "papa:log.php:10:1";
//		String newStr = "";
//		for (String key : parent.keySet()) {
//			Object value = parent.get(key);
//			if ("data".equalsIgnoreCase(key)) {
//				Map<String, Object> child = (new Gson()).fromJson(new Gson().toJson(value), new TypeToken<Map<String, Object>>() {}.getType());
//				Map<String, Object> datas = new LinkedHashMap<String, Object>();
//				datas.putAll(child);
//				for (String key2 : child.keySet()) {
//					// kalo ketemu increment sequence
//					if(searchKey.equalsIgnoreCase(key2)) {
//						int seq = Integer.parseInt(searchKey.substring(searchKey.length() - 1, searchKey.length()));
//						seq += 1;
//						
//						String temp = searchKey.substring(0, searchKey.length() - 1);
//						newStr = temp + seq;
//						
//						datas.put(newStr, "baruhit");
//					}
//					// kalo ga tambahin
//					else {
//						datas.put(searchKey, "baruhit");
//					}
//				}
//				
//				parent.put("data", datas);
//			}
//		}
//		System.out.println("NEW");
//		System.out.println(parent);
		
		
		
	}
}