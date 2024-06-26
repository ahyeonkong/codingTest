import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

		int A = Integer.parseInt(stringTokenizer.nextToken());
		int B = Integer.parseInt(stringTokenizer.nextToken());

		Map<String, Integer> aMap = new HashMap<String, Integer>();
		Map<String, Integer> bMap = new HashMap<String, Integer>();

		StringTokenizer a_token = new StringTokenizer(bufferedReader.readLine(), " ");
		StringTokenizer b_token = new StringTokenizer(bufferedReader.readLine(), " ");

		for (int i = 0; i < A; i++) {
			aMap.put(a_token.nextToken(), 1);
		}

		for (int i = 0; i < B; i++) {
			bMap.put(b_token.nextToken(), 1);
		}

		Map<String, Integer> copy_A = new HashMap<String, Integer>(aMap);
		
		copy_A.entrySet().retainAll(bMap.entrySet());

		System.out.println(A + B - copy_A.size() * 2);
		
		bufferedReader.close();
		bufferedWriter.flush();
		bufferedWriter.close();
	}
}