import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        String enter = "ENTER";
        int answer = 0;

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < N; i++){
            String user = bufferedReader.readLine();
            if(user.equals(enter)){
                answer += hashMap.size();
                hashMap.clear();
            }
            else
                hashMap.put(user, hashMap.getOrDefault(user, 0) + 1);
        }
        answer += hashMap.size();
        System.out.println(answer);
    }
}