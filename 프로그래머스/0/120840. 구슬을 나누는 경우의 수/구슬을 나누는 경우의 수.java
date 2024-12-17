class Solution {
    public int combination(int balls, int share) {
        if(share == 0 || balls == share)
            return 1;
        else
            // 파스칼의 삼각형 원리
            return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
    }
    public int solution(int balls, int share){
        int answer = 0;
        answer = combination(balls, share);
        return answer;
    }
}