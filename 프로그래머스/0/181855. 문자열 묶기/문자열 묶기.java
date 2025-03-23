import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[100001];
        
        for (String str : strArr) {
            arr[str.length()]++;
        }
        
        for (int count : arr) {
            answer = Math.max(answer, count);
        }
        
        return answer;
    }
}
