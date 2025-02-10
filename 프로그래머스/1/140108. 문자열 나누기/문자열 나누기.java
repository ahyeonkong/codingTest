class Solution {
    public int solution(String s) {
        char x = s.charAt(0); // b
        int count = 1; // 문자열 분리
        int answer = 1;
        
        for(int i = 1; i < s.length(); i++){ // 1~5
            if(count == 0){ // i = 2 i = 4
                x = s.charAt(i); // x = n x = n
                answer++; // 2 3
            }
            if(x == s.charAt(i)){
                count++; // 1 1
            }else{
                count--; // 0 0 0 0
            }
        }
        return answer;
    }
}