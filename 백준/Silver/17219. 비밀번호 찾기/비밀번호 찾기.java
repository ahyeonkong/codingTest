import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
        String[] tokens = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(tokens[0]);
        int M = Integer.parseInt(tokens[1]);
        
        Map<String, String> map = new HashMap<String, String>();
        for(int i = 0; i < N; i++) {
        	tokens = bufferedReader.readLine().split(" ");
        	map.put(tokens[0], tokens[1]);
        }
        
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < M; i++)
        	stringBuilder.append(map.get(bufferedReader.readLine())).append('\n');
        
        bufferedWriter.write(stringBuilder.toString());
		
		bufferedReader.close();
		bufferedWriter.flush();
		bufferedWriter.close();		
	}
}
