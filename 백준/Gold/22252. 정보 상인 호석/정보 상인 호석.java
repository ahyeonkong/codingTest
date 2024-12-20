import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, PriorityQueue<Integer>> hashMap = new HashMap<>();
        int Q = Integer.parseInt(bufferedReader.readLine());
        long answer = 0;

        for(int i = 0; i < Q; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int query = Integer.parseInt(stringTokenizer.nextToken());
            String name = stringTokenizer.nextToken();
            int num = Integer.parseInt(stringTokenizer.nextToken());

            if (query == 1) {
                if(!hashMap.containsKey(name)){
                    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
                    for(int j = 0; j < num; j++){
                        priorityQueue.add(Integer.parseInt(stringTokenizer.nextToken()));
                    }
                    hashMap.put(name, priorityQueue);
                }
                else{
                    for(int j = 0; j < num; j++){
                        hashMap.get(name).add(Integer.parseInt(stringTokenizer.nextToken()));
                    }
                }
            }
            else if (query == 2) {
                if(hashMap.containsKey(name)){
                    PriorityQueue<Integer> priorityQueue = hashMap.get(name);
                    for(int j = 0; j < num && !priorityQueue.isEmpty(); j++){
                        answer += priorityQueue.poll();
                    }
                }
            }
        }
        System.out.println(answer);
    }
}