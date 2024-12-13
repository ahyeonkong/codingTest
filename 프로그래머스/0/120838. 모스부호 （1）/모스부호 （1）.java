class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = { 
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };
        String[] str = letter.split(" ");
        for(String s: str){
            for(int i = 0; i < morse.length; i++){
                if(morse[i].equals(s))
                    answer += (char)(i + 97);
            }
        }
        return answer;
    }
}