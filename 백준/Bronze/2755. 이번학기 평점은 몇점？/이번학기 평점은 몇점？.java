import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [][] arr = new String [n][3];

        double culSum = 0; // 학점 * 성적
        double scoreSum = 0; // 학점의 합

        for(int i = 0; i < n; i++) {
            double temp = 0;
            for(int j = 0; j < 3; j++)
                arr[i][j] = scanner.next();
            String score = arr[i][2];

            if (score.charAt(0) == 'A') temp = 4; 
            if (score.charAt(0) == 'B') temp = 3; 
            if (score.charAt(0) == 'C') temp = 2; 
            if (score.charAt(0) == 'D') temp = 1;

            // 성적이 2자 이상인지 확인
            if (score.length() > 1) {
                if (score.charAt(1) == '+') temp += 0.3; 
                if (score.charAt(1) == '-') temp -= 0.3;
            }

            culSum += Integer.parseInt(arr[i][1]) * temp;    
            scoreSum += Integer.parseInt(arr[i][1]);
        }

        System.out.println(String.format("%.2f", culSum / scoreSum));
        scanner.close();
    }
}
