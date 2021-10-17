package headfirst.java.chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();

	}

	public void go() {
		try {
			Socket s = new Socket("127.0.0.1",4242);
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);

			String advice = reader.readLine();
			System.out.println("Today you should: " + advice);

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
