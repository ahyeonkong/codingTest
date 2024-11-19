class Solution {
    public int solution(String number) {
        String[] arr = number.split("");
        int answer = 0;
        
        for(String s: arr)
            answer += Integer.parseInt(s);

        return answer % 9;
    }
}