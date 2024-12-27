import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 조합 문제
public class Main {
    static int n;
    static int k;
    static String[] cards;
    static boolean[] visited;

    static HashMap<String, Integer> hashMap = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bufferedReader.readLine());
        k = Integer.parseInt(bufferedReader.readLine());
        cards = new String[n];
        visited = new boolean[n];

        for(int i = 0; i < n; i++){
            cards[i] = bufferedReader.readLine();
        }
        combination("", 0);
        System.out.println(hashMap.size());
    }

    // 조합 재귀함수
    public static void combination(String num, int count){
        if(count == k){
            hashMap.put(num, 1);
            return;
        }

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                combination(num + cards[i], count + 1);
                visited[i] = false;
            }
        }
    }
}