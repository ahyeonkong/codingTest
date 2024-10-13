import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        /*
            i = 2, j = 5, k = 3이라면
            commands는 [2,5,3]이 된다.
        */
        int[] answer = new int[commands.length];

        for(int a = 0; a < commands.length; a++){
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];

            int[] tmp = new int[j-i+1];
            
            for(int b = 0; b < j-i+1; b++)
                tmp[b] = array[i - 1 + b];

            Arrays.sort(tmp);
            answer[a] = tmp[k-1];
        }
        return answer;
    }
}