import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Long, Integer> hashMap = new HashMap<>();
        int N = Integer.parseInt(bufferedReader.readLine());
        int max = 0;
        long answer = 0;

        for(int i = 0; i < N; i++){
            long num = Long.parseLong(bufferedReader.readLine());
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        for(long k: hashMap.keySet()){
            if(hashMap.get(k) > max){
                max = hashMap.get(k);
                answer = k;
            }
            else if(hashMap.get(k) == max){
                answer = Math.min(k, answer);
            }
        }
        System.out.println(answer);
    }
}