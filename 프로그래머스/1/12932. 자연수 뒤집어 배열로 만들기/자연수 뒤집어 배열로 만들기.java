class Solution {
    public int[] solution(long n) {
        String N = String.valueOf(n);
        int[] answer = new int[N.length()];
        
        for(int i = 0; i < N.length(); i++){
            answer[N.length() - i - 1] = N.charAt(i) - '0';
        }
        return answer;
    }
}