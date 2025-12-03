import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int[] height = new int[N];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < N; i++){
            height[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int[] stack = new int[N];
        int top = -1; // top 초기화

        for(int i = 0; i < N; i++){
            // 현재 탑보다 낮은 탑을 모두 pop
            while(top >= 0 && height[stack[top]] < height[i]){
                top--;
            }

            if(top == -1)
                stringBuilder.append(0);
            else
                stringBuilder.append(stack[top] + 1);
            if (i < N - 1) stringBuilder.append(' ');

            stack[++top] = i;

        }
        System.out.println(stringBuilder);
    }
}
