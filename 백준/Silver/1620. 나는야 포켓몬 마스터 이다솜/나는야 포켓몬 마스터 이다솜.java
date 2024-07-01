import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        
        Map<Integer, String> hashMap = new HashMap<>();
        Map<String, Integer> reverseHashMap = new HashMap<>();
        
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        
        for (int i = 1; i <= N; i++) {
            String value = bufferedReader.readLine();
            hashMap.put(i, value);
            reverseHashMap.put(value, i);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String line = bufferedReader.readLine();
            char first = line.charAt(0);
            
            if (Character.isLetter(first))
                sb.append(reverseHashMap.get(line)).append("\n");
            else
                sb.append(hashMap.get(Integer.parseInt(line))).append("\n");
        }
        
        if (sb.length() > 0)
            sb.setLength(sb.length() - 1);
        
        System.out.print(sb);
        
        bufferedReader.close();
    }
}