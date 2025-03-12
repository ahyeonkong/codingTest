class Solution {
    public int[] solution(String myString) {
        String[] slice = myString.split("x", -1);
        int[] answer = new int[slice.length];
        
        for(int i = 0; i < slice.length; i++){
            answer[i] = slice[i].length();
        }
        return answer;
    }
}