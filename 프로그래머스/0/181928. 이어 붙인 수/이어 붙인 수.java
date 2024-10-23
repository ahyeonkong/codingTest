import java.lang.*;

class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;
        
        StringBuilder oddStringBuilder = new StringBuilder();
        StringBuilder evenStringBuilder = new StringBuilder();
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 != 0)
                oddStringBuilder.append(num_list[i]);
            else
                evenStringBuilder.append(num_list[i]);
        }

        oddSum = Integer.parseInt(oddStringBuilder.toString());
        evenSum = Integer.parseInt(evenStringBuilder.toString());
        
        return oddSum + evenSum;
    }
}
