class Solution {
    boolean solution(String s) {
        boolean answer = true;
        /*
            개수를 비교할 때 대문자와 소문자는 구별하지 않기 때문에
            toLowerCase()를 이용해서 모두 소문자로 변경
        */
        s = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p') pCount++;
            else if(s.charAt(i) == 'y') yCount++;
        }
        
        if(pCount != yCount) answer = false;

        return answer;
    }
}