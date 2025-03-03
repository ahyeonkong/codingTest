class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder stringbuilder = new StringBuilder(my_string.substring(s, e + 1));
        stringbuilder.reverse();
        return my_string.substring(0, s) + stringbuilder + my_string.substring(e + 1);
    }
}