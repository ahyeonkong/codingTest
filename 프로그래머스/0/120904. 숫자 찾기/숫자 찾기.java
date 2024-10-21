class Solution {
    public int solution(int num, int k) {
        String str = Integer.toString(num);
        String[] arr = str.split("");
        int answer = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(Integer.toString(k)))
                return i+1;
        }
        
        return -1;
    }
}