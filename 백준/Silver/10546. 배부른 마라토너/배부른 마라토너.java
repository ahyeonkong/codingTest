import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < N; i++){
            String name = bufferedReader.readLine();
            hashMap.put(name, hashMap.getOrDefault(name, 0) + 1);
        }

        for(int i = 0; i < N-1; i++){
            String name = bufferedReader.readLine();
            hashMap.put(name, hashMap.get(name) - 1);
            if(hashMap.get(name) == 0){
                hashMap.remove(name);
            }
        }

        for(String k: hashMap.keySet())
            System.out.println(k);
    }
}