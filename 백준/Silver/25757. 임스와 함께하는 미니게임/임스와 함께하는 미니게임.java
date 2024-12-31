import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        char game = arr[1].charAt(0);
        int member = 0;
        int result = 0;

        HashSet<String> hashSet = new HashSet<>();

        for(int i = 0; i < N; i++)
            hashSet.add(bufferedReader.readLine());

        switch(game){
            case 'Y':
                member = 2;
                break;
            case 'F':
                member = 3;
                break;
            case 'O':
                member = 4;
                break;
            default: break;
        }

        result = hashSet.size() / (member-1);
        System.out.println(result);
    }
}