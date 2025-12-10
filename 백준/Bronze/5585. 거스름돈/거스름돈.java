import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int money = 1000 - Integer.parseInt(stringTokenizer.nextToken());
        int result = 0;

        while(true){
            int count;
            if(money == 0) {
                System.out.println(result);
                break;
            }

            if(money >= 500) { // 620
                count = money / 500; // 1
                result += count; // 1 = 0 + 1
                money -= count * 500; // 120 = 620 - 500
            }
            else if(money >= 100) {  // 120
                count = money / 100; // 1
                result += count; // 2 = 1 + 1
                money -= count * 100; // 20 = 120 - 100
            }
            else if(money >= 50){
                count = money / 50;
                result += count;
                money -= count * 50;
            }
            else if(money >= 10){ // 20
                count = money / 10; // 2
                result += count; // 4 = 2 + 2
                money -= count * 10; // 0 = 20 - 20
            }
            else if(money >= 5){
                count = money / 5;
                result += count;
                money -= count * 5;
            }
            else if(money >= 1){
                count = money;
                result += count;
                money -= count;
            }
        }
    }
}