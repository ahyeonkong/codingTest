import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];

        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}