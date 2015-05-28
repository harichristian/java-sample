package moba.deviceatlas;

import java.util.HashMap;
import java.util.Map;

import mobi.mtld.deviceatlas.cloud.Client;
import mobi.mtld.deviceatlas.cloud.DaClientException;

public class DaBasic {
	
    private static final String LICENCE = "8519ec82d1b61666daca3de419c16d93";
    
	public static void main(String[] args) {
		showDeviceDataByHeaders();
        showDeviceDataByUa();
	}
	
	/**
     * Get device data, passing http headers
     */
    @SuppressWarnings("rawtypes")
	public static void showDeviceDataByHeaders() {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("User-Agent", "Mozilla/5.0 (SymbianOS/9.2; U; Series60/3.1 NokiaN95_8GB/15.0.015; Profile/MIDP-2.0 Configuration/CLDC-1.1 )AppleWebKit/413 (KHTML, like Gecko) Safari/413");
        headers.put("X-Profile", "http://nds.nokia.com/uaprof/NN95_8GB-1r100.xml");
        headers.put("Accept", "text/html,text/css,multipart/mixed,application/java-archive,application/java");
        headers.put("Accept-Language", "en-us,en;q=0.5");

        Map results = null;
 
        try {
            Client client = Client.getInstance();
            client.setLicenceKey(LICENCE);
            results = client.getDeviceDataByHeaders(headers);

            System.out.println(results.get(Client.KEY_USERAGENT));
            System.out.println(results.get(Client.KEY_SOURCE));
            System.out.println(results.get(Client.KEY_PROPERTIES));

        } catch (DaClientException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get device data, passing a user-agent string
     */
    @SuppressWarnings("rawtypes")
	public static void showDeviceDataByUa() {
        String ua = "Mozilla/5.0 (SymbianOS/9.2; U; Series60/3.1 NokiaN95_8GB/15.0.015; Profile/MIDP-2.0 Configuration/CLDC-1.1 )AppleWebKit/413 (KHTML, like Gecko) Safari/413";

        Map results = null;

        try {
            Client client = Client.getInstance();
            client.setLicenceKey(LICENCE);
            results = client.getDeviceDataByUserAgent(ua);

            System.out.println(results.get(Client.KEY_USERAGENT));
            System.out.println(results.get(Client.KEY_SOURCE));
            System.out.println(results.get(Client.KEY_PROPERTIES));

        } catch (DaClientException e) {
            e.printStackTrace();
        }
    }
}
