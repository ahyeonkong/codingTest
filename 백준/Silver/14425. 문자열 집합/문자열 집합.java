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
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		int count = 0;
		
		Map<String, Integer> nMap = new HashMap<>();
		
		for(int i = 0; i < N; i++)
			nMap.put(bufferedReader.readLine(), 0);
		
		for(int i = 0; i < M; i++) {
			String line = bufferedReader.readLine();
			if(nMap.containsKey(line))
				count++;
		}
	
		bufferedWriter.write(String.valueOf(count));
		
		bufferedWriter.flush();
		bufferedWriter.close();
		bufferedReader.close();
	}
}
