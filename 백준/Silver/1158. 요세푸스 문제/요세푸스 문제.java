import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        for(int i = 1; i <= N; i++)
            queue.add(i);

        stringBuilder.append("<");
        // queue 사이즈가 1이 아닐 때
        while(queue.size() != 1){
            for(int i = 0 ; i < K - 1; i++)
                queue.add(queue.poll());
            stringBuilder.append(queue.poll()).append(", ");
        }
        // queue 사이즈가 1일 때
        stringBuilder.append(queue.poll()).append(">");
        System.out.println(stringBuilder);
    }
}