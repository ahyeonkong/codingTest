class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int min = arr[0];
        
        for(int a: arr){
            if(a < min){
                min = a;
            }
        }
        
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min){
                answer[j++] = arr[i];
            }
        }

        if(arr.length == 1){
            return new int[]{-1};
        }
        return answer;
    }
}