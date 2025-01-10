import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static Stack<Integer> stack = new Stack<>();

    public static int top(){
        if(stack.empty())
            return -1;
        else return stack.peek();
    }

    public static int pop(){
        if(stack.empty())
            return -1;
        else return stack.pop();
    }

    public static int empty(){
        if(stack.empty())
            return 1;
        else return 0;
    }

    public static int size(){
        return stack.size();
    }

    public static void push(int num) {
        stack.push(num);
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
                    int num = Integer.parseInt(stringTokenizer.nextToken());
                    push(num);
                    break;
                case "pop":
                    stringBuilder.append(pop()).append("\n");
                    break;
                case "top":
                    stringBuilder.append(top()).append("\n");
                    break;
                case "size":
                    stringBuilder.append(size()).append("\n");
                    break;
                case "empty":
                    stringBuilder.append(empty()).append("\n");
                    break;
            }
            System.out.print(stringBuilder);
        }
    }
}