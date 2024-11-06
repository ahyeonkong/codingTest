class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kk = String.valueOf(k);
        
        for (int a = i; a <= j; a++) {
            String aa = String.valueOf(a);
            
            for (int b = 0; b < aa.length(); b++) {
                if (String.valueOf(aa.charAt(b)).equals(kk)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
