import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        // 큰 숫자를 먼저 출력해야 하므로 reverseOrder()로 내림차순 정렬
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < N; i ++) {
            int x = Integer.parseInt(bufferedReader.readLine());

            // x가 0일 때, 배열이 비어있으면 0 출력
            // x가 자연수일 때, 배열 맨 앞에 추가, 출력, 제거

            if(x == 0) {
                if (priorityQueue.isEmpty())
                    stringBuilder.append(0).append("\n");
                else
                    stringBuilder.append(priorityQueue.poll()).append("\n");
            }
            else{
                priorityQueue.offer(x);
            }
        }
        System.out.println(stringBuilder);
    }
}