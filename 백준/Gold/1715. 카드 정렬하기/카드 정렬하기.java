import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int answer = 0;

        for(int i = 0; i < N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            priorityQueue.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        while(priorityQueue.size() > 1){
            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            answer += a + b;
            priorityQueue.add(a+b);
        }
        System.out.println(answer);
    }
}