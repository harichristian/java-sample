package moba.apachehttp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.codec.binary.Base64;

public class HttpTest {
	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) {
		HttpTest http = new HttpTest();

		// System.out.println("Testing 1 - Send Http GET request");
		// try {
		// http.sendGet();
		// } catch (Exception e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }

		// System.out.println("\nTesting 2 - Send Http POST request");
		// try {
		// http.sendPost();
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// System.out.println("\nTesting 3 - Send Http POST request");
		// try {
		// http.twilio();
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		System.out.println("\nTesting 4 - Send Http POST request");
		try {
			http.wap();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// HTTP GET request
	private void sendGet() throws Exception {

		String url = "http://www.google.com/search?q=mkyong";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		// add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(
				con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());

	}

	// HTTP POST request
	private void sendPost() throws Exception {

		String url = "https://selfsolve.apple.com/wcResults.do";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		// add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(
				con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());

	}

	private void twilio() throws IOException {
		// curl -X POST
		// https://api.twilio.com/2010-04-01/Accounts/AC91ac6d71ad276a695de6af75853550ed/SMS/Messages.json
		// \
		// -u
		// AC91ac6d71ad276a695de6af75853550ed:35261b9597a2a4bded3d89a260466008 \
		// --data-urlencode "From=+12676139354" \
		// --data-urlencode "To=+628170976242" \
		// --data-urlencode 'Body=Hello Hari, welcome to Twilio!'

		String stringUrl = "https://api.twilio.com/2010-04-01/Accounts/AC91ac6d71ad276a695de6af75853550ed/SMS/Messages.json";
		URL url = new URL(stringUrl);
		HttpsURLConnection uc = (HttpsURLConnection) url.openConnection();
		uc.setRequestProperty("X-Requested-With", "Curl");

		String userpass = "AC91ac6d71ad276a695de6af75853550ed" + ":"
				+ "35261b9597a2a4bded3d89a260466008";
		String basicAuth = "Basic "
				+ new String(new Base64().encode(userpass.getBytes()));
		uc.setRequestProperty("Authorization", basicAuth);
		// add reuqest header
		uc.setRequestMethod("POST");
		uc.setRequestProperty("User-Agent", USER_AGENT);
		uc.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "From=+12676139354&To=+628170976242&Body=HAHA";

		// Send post request
		uc.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(uc.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = uc.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(
				uc.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());

	}

	// HTTP GET request
	private void wap() throws Exception {

		String url = "http://kamusasmara.com/3332303a32333a3236393a584c4243496cebc20530d0d54e23ae14ee8f32?redirect=1";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		// add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(
				con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());

	}
}
