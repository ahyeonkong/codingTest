import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashmap = new HashMap<>();
        
        for(String player : participant) 
            hashmap.put(player, hashmap.getOrDefault(player, 0) +1);
        for(String player : completion)
            hashmap.put(player, hashmap.get(player) -1);
        
        for(String key : hashmap.keySet()) {
            if(hashmap.get(key) != 0){
                answer = key;
                break;
            }            
        }                     
        return answer;
    }
}