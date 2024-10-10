class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] arr = Integer.toString(x).split("");
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        if(x % sum != 0) answer = false;   
        
        return answer;
    }
}