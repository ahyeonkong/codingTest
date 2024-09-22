class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char c;
        for(int i = 0; i < my_string.length(); i++){
            c = my_string.charAt(i);
            if(c >= '0' && c <= '9')
                answer += c - '0'; // 정수로 변환
        }
        return answer;
    }
}