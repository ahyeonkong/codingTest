import java.io.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0; i < t; i++) {
			BigInteger bigInteger = new BigInteger(bufferedReader.readLine());
			System.out.println(bigInteger.multiply(bigInteger));
		}
	}
}