class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replace('A','X').replace('B','A').replace('X','B');
        if(myString.contains(pat)) answer = 1;
        return answer;
    }
}