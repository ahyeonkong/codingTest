import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        
        for(String[] cloth : clothes){
            String category = cloth[1]; // 의상의 종류를 추출
            hashmap.put(category, hashmap.getOrDefault(category, 0) + 1);
        }
        
        int answer = 1;
        for(int count : hashmap.values()){
            answer *= (count + 1);
        }
        return answer - 1;
    }
}