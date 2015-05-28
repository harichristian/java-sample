package moba.apachehttp;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by hc on 4/22/15.
 */
public class MoCreator {
    private final String HTTP_USER_AGENT = "Mozilla/5.0 (Linux; U; Android 4.2.2; id-id; MITO A390 Build/JDQ39) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30";

    public static void main(String[] args) {
        MoCreator http = new MoCreator();
        try {
            http.wap2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // HTTP GET request
    private void wap() {
        try {
//            String url = "http://kamusasmara.com/3332303a32333a3236393a584c4243496cebc20530d0d54e23ae14ee8f32?redirect=1";
//            String url = "http://112.215.81.112:8080/Wap_action.jsp?dest=98700&content=daftar%20cup&success=http://202.162.207.10:8080/wap/dr/smsc/8700/12345&confirmrandom=123456&status=0&confirm=ok&needconfirm=0&channel=0";
            String url = "http://fon4fun.com";

            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // optional default is GET
            con.setRequestMethod("GET");

            // add request header
            con.setRequestProperty("HTTP_USER_AGENT", HTTP_USER_AGENT);

            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + url);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // HTTP GET request
    private void wap2() {
        try {
//            String url = "http://kamusasmara.com/3332303a32333a3236393a584c4243496cebc20530d0d54e23ae14ee8f32?redirect=1";
//            String url = "http://112.215.81.112:8080/Wap_action.jsp?dest=98700&content=daftar%20cup&success=http://202.162.207.10:8080/wap/dr/smsc/8700/12345&confirmrandom=123456&status=0&confirm=ok&needconfirm=0&channel=0";
            String url = "http://fon4fun.com";

            CloseableHttpClient httpclient = HttpClients.createDefault();
//            HttpClient httpclient = HttpClientBuilder.create().build();

            HttpGet httpget = new HttpGet(url);

            // add request header
            httpget.addHeader("User-Agent", HTTP_USER_AGENT);

//            HttpResponse response = httpclient.execute(httpget);

            CloseableHttpResponse response = httpclient.execute(httpget);

            System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
