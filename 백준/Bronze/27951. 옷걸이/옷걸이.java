import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        int[] A = new int[N];
        char[] a = new char[N];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int U = Integer.parseInt(stringTokenizer.nextToken());
        int D = Integer.parseInt(stringTokenizer.nextToken());

        for(int i = 0; i < N; i++) {
            if(A[i] == 1) {
                a[i] = 'U';
                U--;
            }
            else if(A[i] == 2) {
                a[i] = 'D';
                D--;
            }
        }

        for(int i = 0; i < N; i++){
            if(A[i] == 3){
                if(U > 0){
                    a[i] = 'U';
                    U--;
                }
                else{
                    a[i] = 'D';
                    D--;
                }
            }
        }

        if(U == 0 && D == 0) {
            stringBuilder.append("YES\n");
            for(int i = 0; i < N; i++) {
                stringBuilder.append(a[i]);
            }
            System.out.println(stringBuilder);
        } else {
            System.out.println("NO");
        }
    }
}