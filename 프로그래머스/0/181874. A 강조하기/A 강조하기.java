class Solution {
    public String solution(String myString) {
        String answer = ""; 
        myString = myString.toLowerCase(); 
        answer = myString.replace('a', 'A');
        return answer;
    }
}