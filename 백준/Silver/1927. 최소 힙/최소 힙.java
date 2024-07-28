import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int N = Integer.parseInt(stringTokenizer.nextToken());

        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(bufferedReader.readLine());

            if(x == 0){
                if(priorityQueue.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(priorityQueue.poll());
                }
            }
            else{
                priorityQueue.add(x);
            }
        }
    }
}