class Solution {
    public int solution(int[] num_list) {
        int answer = 0; int sum = 0; int mul = 1;
        
        if(num_list.length >= 11){
            for(int i = 0; i < num_list.length; i++)
                sum += num_list[i];
            answer = sum;
        }
        else{
            for(int i = 0; i < num_list.length; i++)
                mul *= num_list[i];
            answer = mul;
        }
        return answer;
    }
}