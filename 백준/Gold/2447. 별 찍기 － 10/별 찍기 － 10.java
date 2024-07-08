// 분할 정복,  재귀 ...
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        map = new char[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                map[i][j] = ' ';
            }
        }

        star(0, 0, n);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                bufferedWriter.write(map[i][j]);
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
    }

    public static void star(int x, int y, int n) {
        if (n == 1) {
            map[x][y] = '*';
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                star(x + (i * n / 3), y + (j * n / 3), n / 3);
            }
        }
    }
}