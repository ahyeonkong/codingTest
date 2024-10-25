import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length / 2;
        HashSet<Integer> hashset = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            hashset.add(nums[i]);
        }
        
        int size = hashset.size();
        
        if(size >= length)
            answer = length;
        else
            answer = size;
        
        return answer;
    }
}