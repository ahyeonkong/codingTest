import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] science = new int[4];
        int[] history = new int[2];

        for (int i = 0; i < 4; i++) {
            science[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 2; i++) {
            history[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(science);
        Arrays.sort(history);

        int sum = science[1] + science[2] + science[3] + history[1];

        System.out.println(sum);
    }
}