class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        int num = n - 1;
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[num++];
        }
        return answer;
    }
}