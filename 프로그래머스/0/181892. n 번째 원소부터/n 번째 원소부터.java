class Solution {
    public int[] solution(int[] num_list, int n) {
        int count = 0;
        for(int i = n-1; i < num_list.length; i++)
            count++;
        
        int[] answer = new int[count];
        int k = 0;
        
        for(int j = n-1; j < num_list.length; j++){
            answer[k] = num_list[j];
            k++;
        }
        
        return answer;
    }
}