import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char[] data = input.toCharArray();
        
        int count0 = 0;
        int count1 = 0;
        
        if(data[0] == '0')
            count1 += 1;
        else count0 += 1;

        for(int i = 0; i < data.length - 1; i++){
            if(data[i] != data[i+1]){
                if(data[i + 1] == '1'){
                    count0 += 1;
                }else count1 += 1;
            }
        }
        System.out.println(Math.min(count0, count1));
    }
}