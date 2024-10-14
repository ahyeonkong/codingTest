class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            answer[i] = arr[i];
        if(arr.length % 2 != 0)
            for(int j = 0; j < arr.length; j++)
                answer[j] = arr[j++] + n;
        else
            for(int j = 1; j < arr.length; j++)
                answer[j] = arr[j++] + n;
        return answer;
    }
}