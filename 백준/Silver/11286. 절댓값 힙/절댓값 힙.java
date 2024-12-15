import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2)) return o1 - o2;
                else return Math.abs(o1) - Math.abs(o2);
            }
        });

        for (int i = 0; i < N; i ++) {
            int x = Integer.parseInt(bufferedReader.readLine());

            if(x == 0) {
                int out = priorityQueue.isEmpty() ? 0 : priorityQueue.poll();
                System.out.println(out);
            }
            else priorityQueue.offer(x);
        }
    }
}