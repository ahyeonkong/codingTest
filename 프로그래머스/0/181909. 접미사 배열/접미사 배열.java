import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] arr = new String[length];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = my_string.substring(i);
        }
        
        Arrays.sort(arr);
        return arr;
    }
}