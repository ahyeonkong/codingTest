class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] numbers = my_string.replaceAll("[^0-9]", " ").split("\\s+");
        for (String s : numbers) {
            if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}
