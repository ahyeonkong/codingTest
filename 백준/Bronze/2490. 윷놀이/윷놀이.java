import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < 3; i++){
            int count = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            for(int j = 0; j < 4; j++)
                count += Integer.parseInt(stringTokenizer.nextToken());

            switch(count){
                case 0:
                    stringBuilder.append("D").append("\n");
                    break;
                case 1:
                    stringBuilder.append("C").append("\n");
                    break;
                case 2:
                    stringBuilder.append("B").append("\n");
                    break;
                case 3:
                    stringBuilder.append("A").append("\n");
                    break;
                case 4:
                    stringBuilder.append("E").append("\n");
                    break;
            }
        }
        System.out.print(stringBuilder);
    }
}