import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int N = Integer.parseInt(bufferedReader.readLine());

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ChongChong");

        for(int i = 0; i < N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String person1 = stringTokenizer.nextToken();
            String person2 = stringTokenizer.nextToken();

            if(hashSet.contains(person1) || hashSet.contains(person2)){
                hashSet.add(person1);
                hashSet.add(person2);
            }
        }
        System.out.println(hashSet.size());
    }
}