import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		long[] t = new long[36];
		t[0] = 1;
		t[1] = 1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 2; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				t[i] += (t[j-1] * t[i-j]);
			}
		}
		System.out.println(t[n]);
	}

}
