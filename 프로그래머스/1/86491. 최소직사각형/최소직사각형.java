import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < sizes.length; i++){
            int maxx = Math.max(sizes[i][0], sizes[i][1]);
            int minn = Math.min(sizes[i][0], sizes[i][1]);
            max = Math.max(max, maxx);
            min = Math.max(min, minn);
        }
        answer = max * min;

        return answer;
    }
}