import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < T; i++){
            Stack<Character> stack = new Stack<>();
            String line = bufferedReader.readLine();
            boolean isValid = true;

            for(int j = 0; j <line.length(); j++){
                char c = line.charAt(j);
                if(c == '(') stack.push(c);
                else if(c == ')'){
                    if(stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    else stack.pop();
                }
            }
            if(stack.isEmpty() && isValid) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}