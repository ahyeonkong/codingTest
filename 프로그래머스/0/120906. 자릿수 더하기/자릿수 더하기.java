class Solution {
    public int solution(int n) {
        int answer = 0;
        String nn = n + "";
        for(int i = 0; i < nn.length(); i++)
            answer += nn.charAt(i) - '0';
        return answer;
    }
}