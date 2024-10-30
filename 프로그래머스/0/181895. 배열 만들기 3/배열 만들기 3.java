class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int length = 0;
        for(int i = 0; i < intervals.length; i++) {
            length += intervals[i][1] - intervals[i][0] + 1;
        }
        
        int[] answer = new int[length];
        int index = 0;
        
        for(int i = 0; i < intervals.length; i++) {
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++)
                answer[index++] = arr[j];
        }

        return answer;
    }
}