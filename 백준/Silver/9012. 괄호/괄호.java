import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = scanner.nextInt();
        Stack<Character> stack = null;

        for(int i = 0; i < T; i++){
            stack = new Stack<>();
            String line = scanner.next();
            boolean isValid = true;

            for(int j = 0; j < line.length(); j++){
                char c = line.charAt(j);
                if(c == '(') {
                    stack.push(c);
                } else if(stack.isEmpty()) {
                    isValid = false;
                    break;
                } else {
                    stack.pop();
                }
            }

            bufferedWriter.flush();
            if(isValid && stack.isEmpty()) {
                bufferedWriter.write("YES\n");
            } else {
                bufferedWriter.write("NO\n");
            }
        }

        scanner.close();
        bufferedWriter.close();
    }
}