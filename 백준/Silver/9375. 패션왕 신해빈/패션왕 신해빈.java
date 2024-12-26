import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < T; i++){
            HashMap<String, Integer> hashMap = new HashMap<>();
            int n = Integer.parseInt(bufferedReader.readLine());

            for(int j = 0; j < n; j++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                String name = stringTokenizer.nextToken();
                String type = stringTokenizer.nextToken();
                hashMap.put(type, hashMap.getOrDefault(type, 0) + 1);
            }

            int result = 1;
            for(int val: hashMap.values())
                result *= (val + 1);
            System.out.println(result - 1);
        }
    }
}