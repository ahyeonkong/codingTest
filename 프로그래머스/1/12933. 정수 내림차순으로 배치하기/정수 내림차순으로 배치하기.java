import java.util.*;

class Solution {
    public long solution(long n) {
        /*
            1. 각 자릿수를 문자열 배열로 바꾸고
            2. Arrays.sort()로 오름차순 정렬하기
            3. 그 다음 직접 내림차순 정렬하기
        */
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        String string = "";
        
        Arrays.sort(arr); // 112378
        
        for(int i = arr.length-1; i >= 0; i--)
            string += arr[i];
        
        answer = Long.parseLong(string);
        
        return answer;
    }
}