import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        /*
            # stack 이용하기
            
            (가 오면 스택에 push
            )가 왔을 때,
                스택의 사이즈가 0이면 )로 시작하는 문자열이므로 false 반환
                그렇지 않으면 스택에서 하나씩 pop
            
            for문을 다 돌았을 때, 스택의 크기가 0이라는 것은 괄호 짝이 맞았다는 것
            그렇지 않으면 false 반환
        */
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '(') stack.push(c);
            if(c == ')') {
                if(stack.size() == 0) return false;
                else stack.pop();
            }
        }
        if(stack.size() != 0) answer = false;
        return answer;
    }
}