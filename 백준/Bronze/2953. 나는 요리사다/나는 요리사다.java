import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[5][4];
        int sum = 0;
        int max = 0;
        int num = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = scanner.nextInt();
                sum += arr[i][j];
            }
            if(max < sum){
                max = sum;
                num = i + 1;
            }
            sum = 0;
        }
        System.out.println(num + " " + max);
    }
}
