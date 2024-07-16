import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;
        int N = Integer.parseInt(bufferedReader.readLine());
        LinkedList<Integer> queue = new LinkedList<>(); // 스택 구현

        for(int i = 0; i < N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String line = stringTokenizer.nextToken();

            switch(line){
                case "push":
                    int X = Integer.parseInt(stringTokenizer.nextToken());
                    queue.add(X);
                    break;
                case "pop":
                    if(queue.isEmpty()) stringBuilder.append(-1).append("\n");
                    else stringBuilder.append(queue.poll()).append("\n");
                    break;
                case "size":
                    stringBuilder.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) stringBuilder.append(1).append("\n");
                    else stringBuilder.append(0).append("\n");
                    break;
                case "front":
                    if(queue.isEmpty()) stringBuilder.append(-1).append("\n");
                    else stringBuilder.append(queue.peek()).append("\n");
                    break;
                case "back":
                    if(queue.isEmpty()) stringBuilder.append(-1).append("\n");
                    else stringBuilder.append(queue.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(stringBuilder);
        bufferedReader.close();
    }
}