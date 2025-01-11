import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int A = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[A]; // 입력 수열
        int[] result = new int[A]; // 오큰수 저장 배열

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int a = 0; a < A; a++){
            arr[a] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int i = 0; i < result.length; i++){
            result[i] = -1; // -1로 초기화
        }

        stack.push(0);

        for(int j = 1; j < arr.length; j++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[j]){
                result[stack.pop()] = arr[j];
            }
            stack.push(j);
        }

        for (int k : result) {
            stringBuilder.append(k).append(" ");
        }
        System.out.println(stringBuilder);
    }

}