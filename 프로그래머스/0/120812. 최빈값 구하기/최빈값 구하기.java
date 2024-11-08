class Solution {
    public int solution(int[] array) {
        int[] count = new int[1001]; // 0부터 1000까지의 숫자 빈도를 저장할 배열
        int maxFrequency = 0; // 최대 빈도
        int mode = -1; // 최빈값
        
        // 배열을 순회하며 각 숫자의 빈도 계산
        for (int num : array) {
            count[num]++;
            
            if (count[num] > maxFrequency) {
                maxFrequency = count[num];
                mode = num;
            }
        }
        
        // 최빈값이 여러 개인지 확인
        int modeCount = 0;
        for (int frequency : count) {
            if (frequency == maxFrequency) {
                modeCount++;
                if (modeCount > 1) {
                    return -1; // 최빈값이 여러 개면 -1 반환
                }
            }
        }
        
        return mode;
    }
}