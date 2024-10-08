class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder stringBuilder = new StringBuilder();
        String answer = "";
        for(int i = 0; i < index_list.length; i++)
            answer = stringBuilder.append(my_string.charAt(index_list[i])).toString();
        return answer;
    }
}