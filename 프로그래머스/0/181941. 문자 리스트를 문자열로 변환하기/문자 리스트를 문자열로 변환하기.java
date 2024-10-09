import java.util.*;

class Solution {
    public String solution(String[] arr) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            answer = (stringBuilder.append(arr[i])).toString();
        }
        return answer;
    }
}