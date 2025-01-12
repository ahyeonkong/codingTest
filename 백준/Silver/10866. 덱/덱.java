import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static Deque<Integer> deque = new ArrayDeque<>();

    public static void push_front(int X){
        deque.addFirst(X);
    }

    public static void push_back(int X){
        deque.addLast(X);
    }

    public static int pop_front(){
        if(deque.isEmpty()) return -1;
        else return deque.pollFirst();
    }

    public static int pop_back(){
        if(deque.isEmpty()) return -1;
        else return deque.pollLast();
    }

    public static int size(){
       return deque.size();
    }

    public static int empty(){
        if(deque.isEmpty()) return 1;
        else return 0;
    }

    public static int front(){
        if(deque.isEmpty()) return -1;
        else return deque.peekFirst();
    }

    public static int back(){
        if(deque.isEmpty()) return -1;
        else return deque.peekLast();
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
            int X;

            switch(S){
                case "push_front":
                    X = Integer.parseInt(stringTokenizer.nextToken());
                    push_front(X);
                    break;
                case "push_back":
                    X = Integer.parseInt(stringTokenizer.nextToken());
                    push_back(X);
                    break;
                case "pop_front":
                    stringBuilder.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    stringBuilder.append(pop_back()).append("\n");
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