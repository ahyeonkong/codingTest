import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        double score = 0;
        char c = s.charAt(0);
        if (c == 'A') {
            score = 4;
        } else if (c == 'B') {
            score = 3;
        } else if (c == 'C') {
            score = 2;
        } else if (c == 'D') {
            score = 1;
        } else {
            System.out.print("0.0");
            return;
        }
        c = s.charAt(1);
        if (c == '+') {
            score += 0.3;
        } else if (c == '-') {
            score -= 0.3;
        }
        System.out.print(score);
    }
}