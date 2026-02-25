import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String X = new StringBuilder(st.nextToken()).reverse().toString();
		String Y = new StringBuilder(st.nextToken()).reverse().toString();
		String sum = String.valueOf(Integer.parseInt(X)+Integer.parseInt(Y));
		String result = new StringBuilder(sum).reverse().toString();
		System.out.println(Integer.parseInt(result));
	}
}
