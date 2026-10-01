import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < phone_book.length; i++){
            map.put(phone_book[i], i);
        }
                
        for(String pb: phone_book){
            for(int i = 1; i < pb.length(); i++){
                String prefix = pb.substring(0, i);
                if(map.containsKey(prefix))
                    answer = false;
            }
        }

        
        /*
        
        Arrays.sort(phone_book);
        
        for(int i = 0; i < phone_book.length - 1; i++){
            if(phone_book[i + 1].startsWith(phone_book[i]))
                answer = false;
        }
        
        */
        return answer;
    }
}