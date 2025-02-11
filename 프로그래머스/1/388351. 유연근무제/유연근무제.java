class Solution {
    private boolean determineAllowingTime(int preferredTime, int actualTime) {
        // 희망 시간을 시와 분으로 변환
        int preferredMinute = preferredTime % 100;
        int preferredHour = (preferredTime - preferredMinute) / 100;
        
        // 실제 시간을 시와 분으로 변환
        int actualMinute = actualTime % 100;
        int actualHour = (actualTime - actualMinute) / 100;
        
        // 허용 시간 범위 계산
        int allowedMinute = preferredMinute + 10;
        int allowedHour = preferredHour;
        if (allowedMinute > 59) {
            allowedHour += 1;
            allowedMinute -= 60;
        }
        
        boolean isOnTime = true;
        if (allowedHour < actualHour) {
            isOnTime = false;
        } else if (allowedHour == actualHour) {
            if (allowedMinute < actualMinute) {
                isOnTime = false;
            }
        }
        
        return isOnTime;
    }
    
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < timelogs.length; ++i) {
            int day = startday;
            boolean isOnTime = true;
            
            for (int j = 0; j < 7; ++j) {
                if (day < 6) {
                    if (!determineAllowingTime(schedules[i], timelogs[i][j])) {
                        isOnTime = false;
                        break;
                    }
                }
                
                day++;
                if (day == 8) {
                    day = 1;
                }
            }
            
            if (isOnTime) {
                answer++;
            }
        }
        
        return answer;
    }
}
