import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] chArr = my_string.toCharArray();
        Arrays.sort(chArr);
        return new String(chArr);
    }
}