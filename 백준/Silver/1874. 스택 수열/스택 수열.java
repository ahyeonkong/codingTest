import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        int n = Integer.parseInt(bufferedReader.readLine());
        int current = 1;

        for(int i = 0; i < n; i++) {
            int target = Integer.parseInt(bufferedReader.readLine());

            while(current <= target){
                stack.push(current++);
                stringBuilder.append("+\n");
            }

            if(stack.peek() == target){
                stack.pop();
                stringBuilder.append("-\n");
            }
            else {
                System.out.print("NO");
                return;
            }
        }
        System.out.println(stringBuilder);
    }
}