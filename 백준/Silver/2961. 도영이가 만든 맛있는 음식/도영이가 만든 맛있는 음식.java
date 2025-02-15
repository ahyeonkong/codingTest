import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] ingredients; // 재료의 신맛과 쓴맛 저장
    static int minDifference = Integer.MAX_VALUE; // 최소 차이값 초기화

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ingredients = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ingredients[i][0] = Integer.parseInt(st.nextToken()); // 신맛
            ingredients[i][1] = Integer.parseInt(st.nextToken()); // 쓴맛
        }

        findMinDifference(0, 1, 0, 0); // 재귀 시작: 인덱스, 신맛 곱, 쓴맛 합, 선택된 재료 개수
        System.out.println(minDifference);
    }

    static void findMinDifference(int index, int sour, int bitter, int selected) {
        if (index == N) {
            if (selected > 0) {
                minDifference = Math.min(minDifference, Math.abs(sour - bitter));
            }
            return;
        }

        // 현재 재료를 선택하는 경우
        findMinDifference(index + 1, sour * ingredients[index][0], bitter + ingredients[index][1], selected + 1);

        // 현재 재료를 선택하지 않는 경우
        findMinDifference(index + 1, sour, bitter, selected);
    }
}
