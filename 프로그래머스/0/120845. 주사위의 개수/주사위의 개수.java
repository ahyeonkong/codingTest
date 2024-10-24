import java.util.*;

class Solution {
    public int solution(int[] box, int n) {
        // box 가로, 세로, 높이
        // n 모서리의 길이
        int answer = 1;
        
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int i = 0; i < box.length; i++)
            hashmap.put(i, box[i]/n);
        
        for(int i = 0; i < box.length; i++)
            answer *= hashmap.get(i);
        
        return answer;
    }
}