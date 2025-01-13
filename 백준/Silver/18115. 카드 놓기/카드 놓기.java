import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Deque<Integer> deque = new ArrayDeque<>();
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] A = new int[N];

        for(int i = 0; i < A.length; i++)
            A[i] = Integer.parseInt(stringTokenizer.nextToken());

        for(int i = 0; i < A.length; i++){
            int card = i+1;
            int skill = A[N - i - 1];

            switch (skill){
                case 1:
                    deque.addFirst(card);
                    break;
                case 2:
                    if(!deque.isEmpty()){
                        int temp = deque.pollFirst();
                        deque.addFirst(card);
                        deque.addFirst(temp);
                    }
                    else
                        deque.addFirst(card);
                    break;
                case 3:
                    deque.addLast(card);
                    break;
                default:
                    break;
            }
        }
        while (!deque.isEmpty())
            stringBuilder.append(deque.pollFirst()).append(" ");
        System.out.println(stringBuilder);
    }
}