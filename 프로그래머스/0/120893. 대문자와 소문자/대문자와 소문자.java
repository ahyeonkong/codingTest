class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] c =  my_string.toCharArray();
        
        String temp = "";
        
        for(int i = 0; i < c.length; i++){
            if(c[i] >= 65 && c[i] <= 90){
                temp = c[i]+"";
                answer += temp.toLowerCase();
            }
            else if(c[i] >= 97 && c[i] <= 122){
                temp = c[i]+"";
                answer += temp.toUpperCase();
            }
        }
        return answer;
    }
}