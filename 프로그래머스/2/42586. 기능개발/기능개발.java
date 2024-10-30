import java.util.*;

class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
        // Queue에는 필요한 작업 일 수 저장
        // LinkedList가 Queue 인터페이스를 구현하여 FIFO 방식으로 요소를 처리할 수 있음
        Queue<Integer> queue = new LinkedList<>(); // 7, 3, 9

        // List에는 배포되는 기능의 수를 저장
        ArrayList<Integer> answer = new ArrayList<>(); // 2, 1
        
        // 소수점을 반올림하여 작업 일 수 계산
        for(int i = 0; i < progresses.length; i++){
            queue.add((int)Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }
        
        // Queue가 비어있지 않고, 
        // queue.peek()의 값이 그 전에 poll()을 통해 얻은 값, 
        // 즉 minDays 보다 작거나 같을 경우
        while(!queue.isEmpty()){
            int minDays = queue.poll();
            int count = 1;
            
            while(!queue.isEmpty() && queue.peek() <= minDays){
                queue.poll();
                count++;
            }
            answer.add(count);
        }
        return answer;
    }
}