class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int count = 0; int a = 0;
        for(int i = 0; i < finished.length; i++){
            if(finished[i] == false){
                count++;
            }
        }   
        
        String[] answer = new String[count];
        
        for(int i = 0; i < finished.length; i++){
            if(finished[i] == false){
                answer[a] = todo_list[i];
                a++;
            }
        }
        return answer;
    }
}