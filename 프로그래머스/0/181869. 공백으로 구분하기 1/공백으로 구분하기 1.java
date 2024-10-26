class Solution {
    public String[] solution(String my_string) {
        String[] word = my_string.split(" ");
        String[] answer = new String[word.length];
        
        for(int i = 0; i < word.length; i++)
            answer[i] = word[i];
        return answer;
    }
}