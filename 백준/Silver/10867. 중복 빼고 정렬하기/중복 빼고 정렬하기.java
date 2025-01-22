import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        StringBuilder stringBuilder = new StringBuilder();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i = 0; i < N; i++)
            treeSet.add(Integer.parseInt(stringTokenizer.nextToken()));
        
        for(int num: treeSet)
            stringBuilder.append(num).append(" ");
        
        System.out.println(stringBuilder);
    }
}