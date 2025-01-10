import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static Deque<Integer> queue = new LinkedList<>();

    public static void push(int X){
        queue.addLast(X);
    }

    public static int pop(){
        if(queue.isEmpty()) return -1;
        else return queue.pop();
    }

    public static int size(){
        return queue.size();
    }

    public static int empty(){
        if(queue.isEmpty()) return 1;
        else return 0;
    }

    public static int front(){
        if(queue.isEmpty()) return -1;
        else return queue.peekFirst();
    }

    public static int back() {
        if (queue.isEmpty()) return -1;
        else return queue.peekLast();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder;

        int N = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < N; i++){
            stringBuilder = new StringBuilder();
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String S = stringTokenizer.nextToken();

            switch(S){
                case "push":
                    int X = Integer.parseInt(stringTokenizer.nextToken());
                    push(X);
                    break;
                case "pop":
                    stringBuilder.append(pop()).append("\n");
                    break;
                case "size":
                    stringBuilder.append(size()).append("\n");
                    break;
                case "empty":
                    stringBuilder.append(empty()).append("\n");
                    break;
                case "front":
                    stringBuilder.append(front()).append("\n");
                    break;
                case "back":
                    stringBuilder.append(back()).append("\n");
                    break;
            }
            System.out.print(stringBuilder);
        }
    }
}