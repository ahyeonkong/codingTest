import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        int count = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                count++;
            }
        }
        System.out.println(count);
        
        int[] answer = new int[count];
        answer[0] = arr[0];
        int j = 1;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                answer[j++] = arr[i];
            }
        }


        return answer;
    }
}