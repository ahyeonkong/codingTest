import java.util.*;

class Solution {
    public int solution(int[] array) {
        String str = Arrays.toString(array);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '7') count++;
        }
        return count;
    }
}