import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String str = bufferedReader.readLine(); // 문자열
        String bomb = bufferedReader.readLine(); // 폭발 문자열

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));

            if (stack.size() >= bomb.length()) {
                boolean isBomb = true; // 폭발 문자열 있음

                for(int j = 0; j < bomb.length(); j++){
                    if(stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)){
                        isBomb = false;
                        break;
                    }
                }

                if(isBomb){
                    for(int k = 0; k < bomb.length(); k++){
                        stack.pop();
                    }
                }
            }
        }

        if(stack.isEmpty())
            System.out.println("FRULA");
        else{
            for(char c: stack)
                stringBuilder.append(c);
        }
        System.out.print(stringBuilder);
    }
}