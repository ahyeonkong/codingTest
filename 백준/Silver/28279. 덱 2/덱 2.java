import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;
        int N = Integer.parseInt(bufferedReader.readLine());
        Deque<Integer> deque = new LinkedList<>(); // 덱 구현

        for(int i = 0; i < N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int line = Integer.parseInt(stringTokenizer.nextToken());

            switch(line){
                case 1:
                    int X = Integer.parseInt(stringTokenizer.nextToken());
                    deque.addFirst(X);
                    break;
                case 2:
                    X = Integer.parseInt(stringTokenizer.nextToken());
                    deque.addLast(X);
                    break;
                case 3:
                    if(deque.isEmpty()) stringBuilder.append(-1).append("\n");
                    else stringBuilder.append(deque.removeFirst()).append("\n");
                    break;
                case 4:
                    if(deque.isEmpty()) stringBuilder.append(-1).append("\n");
                    else stringBuilder.append(deque.removeLast()).append("\n");
                    break;
                case 5:
                    stringBuilder.append(deque.size()).append("\n");
                    break;
                case 6:
                    if(deque.isEmpty()) stringBuilder.append(1).append("\n");
                    else stringBuilder.append(0).append("\n");
                    break;
                case 7:
                    if(deque.isEmpty()) stringBuilder.append(-1).append("\n");
                    else stringBuilder.append(deque.getFirst()).append("\n");
                    break;
                case 8:
                    if(deque.isEmpty()) stringBuilder.append(-1).append("\n");
                    else stringBuilder.append(deque.getLast()).append("\n");
                    break;
            }
        }
        System.out.println(stringBuilder);
        bufferedReader.close();
    }
}