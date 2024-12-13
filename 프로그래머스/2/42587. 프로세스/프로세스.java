import java.util.*;
// 우선순위 큐
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> priorityqueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < priorities.length; i++)
            priorityqueue.add(priorities[i]);
        
        while(!priorityqueue.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(priorities[i] == priorityqueue.peek()){
                    priorityqueue.poll();
                    answer++;
                    if(i == location) return answer;
                }
            }
        }
        
        return answer;
    }
}