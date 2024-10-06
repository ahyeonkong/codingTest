class Solution {
    public String solution(String s) {
        /*
        1. 문자열 s를 공백을 기준으로 나누어 문자열 배열 arr에 저장
        2. 최소값과 최대값을 문자열 배열 arr의 0번째 요소로 초기화
        3. for문을 순회하며 최소값과 최대값 저장
        4. 최소값과 최대값을 문자열 형태로 반환
        */
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        
        for(int i = 0; i < arr.length; i++){
            if(min > Integer.parseInt(arr[i])) min = Integer.parseInt(arr[i]);
            else if(max < Integer.parseInt(arr[i])) max = Integer.parseInt(arr[i]);
        }
                
        return min + " " + max;
    }
}