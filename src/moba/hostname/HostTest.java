package moba.hostname;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostTest {
	public static void main(String[] args) {
		System.out.println(getHostName());
	}
	
	public static String getHostName() {
		String hostName = "unresolved_host";
		try {
        	String completeHostName = InetAddress.getLocalHost().getHostName();
        	hostName = completeHostName.substring(0, completeHostName.indexOf("."));
        } catch ( NullPointerException e ){
        	hostName = "unresolved_host";
        } catch ( UnknownHostException e ){
        	hostName = "unresolved_host";
        } catch ( Exception e ){
        	hostName = "unresolved_host";
        }
		return hostName;
	}
}