class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sum = Integer.parseInt(a+"" + b+"");
        int mul = 2 * a * b;
        if(sum > mul) answer = sum;
        else if(sum < mul) answer = mul;
        else answer = sum;
        return answer;
    }
}