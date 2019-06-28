package utilities;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebUtility {
	
	public static int sendRequest(String requestType, String json, String url, String uuid) throws Exception {

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("userId", uuid);
		con.setRequestMethod(requestType);
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(json);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("Response Code : " + responseCode);

		//		BufferedReader in = new BufferedReader(
		//				new InputStreamReader(con.getInputStream()));
		//		String inputLine;
		//		StringBuffer response = new StringBuffer();
		//
		//		while ((inputLine = in.readLine()) != null) {
		//			response.append(inputLine);
		//		}
		//		in.close();
		return responseCode;

	}
	
	public static void sendGet() throws Exception {

		String url = "http://localhost:9001/dashboard";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		//con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());

	}

}
