class Solution {
    public int[] solution(long n) {
        long num = n; // 숫자 추출용
        long temp = num; // 자릿수 계산용
        int count = 0; // 자릿수
        int i = 0; // answer 저장 위치

        while(temp != 0){
            temp /= 10;
            count++;
        }
        
        int[] answer = new int[count];
        while(num != 0){
            answer[i++] = (int)(num % 10);
            num /= 10;
        }
                
        return answer;
    }
}