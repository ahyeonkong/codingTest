import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        while (true) {
            line = scanner.nextLine();
            if (line.equals(".")) {
                break;
            }
            System.out.println(solve(line));
        }
    }
    public static String solve(String line) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty() || stack.peek() != '(')
                    return "no";
                else {
                    stack.pop();
                }
            } else if (c == ']') {
                if (stack.empty() || stack.peek() != '[')
                    return "no";
                else {
                    stack.pop();
                }
            }
        }
        if(stack.empty()) return "yes";
        else return "no";
    }
}