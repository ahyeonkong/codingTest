import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int i = 0;
        
        for(int a: arr){
            if(a % divisor == 0){
                answer[i++] = a;
            }
        }      
        
       if(i == 0){
            return new int[]{-1};
        } 

        answer = Arrays.copyOf(answer, i);
        Arrays.sort(answer);
        
        return answer;
    }
}