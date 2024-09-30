class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(Integer.parseInt(a+"" + b+"") > Integer.parseInt(b+"" + a+""))
            answer = Integer.parseInt(a+"" + b+"");
        else
            answer = Integer.parseInt(b+"" + a+"");
        return answer;
    }
}