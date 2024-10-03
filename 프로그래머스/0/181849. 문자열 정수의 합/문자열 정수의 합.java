class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int num = 0;
        for(int i = 0; i < num_str.length(); i++){
            num = Integer.parseInt(num_str.charAt(i)+"");
            answer += num;
        }
        return answer;
    }
}