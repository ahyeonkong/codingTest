import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		
		BigInteger AB = new BigInteger(arr[0]+arr[1]);
		BigInteger CD = new BigInteger(arr[2]+arr[3]);
		
		System.out.println(AB.add(CD));
	}

}
