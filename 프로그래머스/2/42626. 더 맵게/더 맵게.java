import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        
        for(int s: scoville)
            priorityQueue.add(s);
        
        int num = priorityQueue.peek();
        while(num < K){
            if(priorityQueue.size() >= 2){
                priorityQueue.add(priorityQueue.poll() + (priorityQueue.poll() * 2));
                num = priorityQueue.peek();
                answer++;
            }
            else
                return -1;
        }
        return answer;
    }
}