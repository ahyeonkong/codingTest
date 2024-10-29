class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split(" ");
        switch(arr[1]){
            case "+": 
                answer = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
                break;
            case "-": 
                answer = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
                break;
            case "*": 
                answer = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
                break;   
        }
        return answer;
    }
}