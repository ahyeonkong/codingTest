import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[8];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < 8; i++)
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());

        boolean asc = true;
        boolean desc = true;

        for(int i = 0; i < 7; i++){
            if(arr[i+1] > arr[i]) desc = false;
            if(arr[i+1] < arr[i]) asc = false;
        }
        if(asc)
            System.out.println("ascending");
        else if(desc)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}