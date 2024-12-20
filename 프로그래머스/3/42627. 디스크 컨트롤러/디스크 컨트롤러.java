import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int endTime = 0;        
        
        // 오름차순 정렬
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
                PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        
        // 작업의 소요시간이 짧은 것, 작업의 요청 시각이 빠른 것, 작업의 번호가 작은 것 순으로 우선순위가 높음
        int i = 0;
        while(i < jobs.length || !priorityQueue.isEmpty()){
            while(i < jobs.length && jobs[i][0] <= endTime){
                priorityQueue.add(jobs[i++]);
            }
            if(priorityQueue.isEmpty()){
                endTime = jobs[i][0];
            }
            else{
                int[] job = priorityQueue.poll();
                answer += endTime + job[1] - job[0];
                endTime += job[1];
            }
        }
        
        return answer / jobs.length;
    }
}