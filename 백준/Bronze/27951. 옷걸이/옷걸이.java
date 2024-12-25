import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine()); // 옷걸이의 개수
        int[] A = new int[N]; // N개의 정수 1:상의걸이 2:하의걸이 3:옷걸이
        char[] a = new char[N]; // U, D 기록
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < N; i++) 
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int U = Integer.parseInt(stringTokenizer.nextToken()); // 상의
        int D = Integer.parseInt(stringTokenizer.nextToken()); // 하의

        for(int i = 0; i < N; i++){
            if(A[i] == 1 || A[i] == 3 && U > 0){
                a[i] = 'U';
                U--;
            }
            else{
                a[i] = 'D';
                D--;
            }
        }

        if(U == 0 && D == 0){
            stringBuilder.append("YES").append("\n");
            for(int i = 0; i < N; i++) {
                stringBuilder.append(a[i]);
            }
            System.out.println(stringBuilder);
        }
        else{
            System.out.println("NO");
        }
    }
}