import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;
        int N = Integer.parseInt(bufferedReader.readLine());
        Stack<Integer> stack = new Stack<>(); // 스택 구현

        for(int i = 0; i < N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int lineNum = Integer.parseInt(stringTokenizer.nextToken());

            switch(lineNum){
                case 1:
                    int X = Integer.parseInt(stringTokenizer.nextToken());
                    stack.push(X);
                    break;
                case 2:
                    if(stack.isEmpty()) stringBuilder.append(-1).append("\n");
                    else stringBuilder.append(stack.pop()).append("\n");
                    break;
                case 3:
                    stringBuilder.append(stack.size()).append("\n");
                    break;
                case 4:
                    if(stack.isEmpty()) stringBuilder.append(1).append("\n");
                    else stringBuilder.append(0).append("\n");
                    break;
                case 5:
                    if(stack.isEmpty()) stringBuilder.append(-1).append("\n");
                    else stringBuilder.append(stack.peek()).append("\n");
                    break;
            }
        }
        System.out.println(stringBuilder);
        bufferedReader.close();
    }
}