import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<>();
        int max = 0;
        String answer = "";

        int N = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0; i < N; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String title = stringTokenizer.nextToken();
            hashMap.put(title, hashMap.getOrDefault(title, 0) + 1);
            max = Math.max(max, hashMap.get(title));
        }

        for(String key: hashMap.keySet()){
            if(hashMap.get(key) == max){
                if(answer.equals("") || key.compareTo(answer) < 0){
                    answer = key;
                }
            }
        }
        System.out.println(answer);
    }
}