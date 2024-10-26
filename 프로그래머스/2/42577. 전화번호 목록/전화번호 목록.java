import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        /*
            같은 전화번호가 중복해서 들어있지 않기 때문에
            set을 이용하면 된다.
            대신 set은 순서 없이 저장된다.
            그리고 인덱스로 값을 참조할 수 없다.
        */
        HashSet<String> hashset = new HashSet<>();
        for(String phone: phone_book){
            hashset.add(phone);
        }
        
        for(String phone: phone_book){
            for(int i = 1; i < phone.length(); i++){
                String prefix = phone.substring(0, i);
                if(hashset.contains(prefix))
                    answer = false;
            }
        }
        return answer;
    }
}