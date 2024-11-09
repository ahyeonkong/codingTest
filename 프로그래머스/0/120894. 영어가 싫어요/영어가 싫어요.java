class Solution {
    public long solution(String numbers) {
        String[] numberArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < numberArr.length; i++){
            numbers = numbers.replace(numberArr[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}