import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        /*
            최소가 되는 경우?
            [4,2,1] [4,4,5] -> 16+8+5 = 29
            [2,1] [3,4] -> 6+4 = 10
            배열 A는 내림차순, 배열 B는 오름차순으로 정렬
            Arrays.sort()로 오름차순 정렬 후 직접 내림차순 구현
        */
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        int[] arrA = new int[A.length];
        for(int i = 0; i < A.length; i++){
            arrA[i] = A[A.length-1-i];
            /*
                arr[0] = A[2];
                arr[1] = A[1];
                arr[2] = A[0];
            */
        }
        for(int i = 0; i < A.length; i++){
            answer += arrA[i] * B[i];
        }

        return answer;
    }
}