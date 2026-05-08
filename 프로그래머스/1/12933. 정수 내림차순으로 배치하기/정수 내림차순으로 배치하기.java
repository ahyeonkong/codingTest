import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        String[] arr = str.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();

        for(String i: arr){
            sb.append(i);
        }
        return Long.parseLong(sb.toString());

    }
}