import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        /*
            prices는 [1,2,3,2,3]
            return은 [4,3,1,1,0] 으로 구성
            
            prices = 1일 때,
            1은 끝까지 가격이 떨어지지 않음.
            유지 기간 4초
            
            prices = 2일 때,
            2는 끝까지 가격이 떨어지지 않음.
            유지 기간 3초
            
            prices = 3일 때,
            3은 4초일 때 2로 떨어짐.
            유지 기간 1초
            
            prices = 2일 때,
            2는 끝까지 가격이 떨어지지 않음.
            유지 기간 1초
            
            prices = 3일 때,
            3은 마지막 시점이므로 비교할 시점이 없음.
            유지 기간 0초
        */
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            // 현재 가격이 스택의 top에 있는 가격보다 작다면
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }
        
        // 스택에 남아있는 인덱스들 처리
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n - 1 - idx;
        }
        
        return answer;
    }
}