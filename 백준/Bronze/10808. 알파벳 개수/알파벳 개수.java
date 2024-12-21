import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String s = bufferedReader.readLine();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            arr[c-97]++;
        }
        for(int j = 0; j < 26; j++)
            System.out.print(arr[j] + " ");
    }
}