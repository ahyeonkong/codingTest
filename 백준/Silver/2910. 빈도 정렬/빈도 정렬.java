import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        // 숫자의 등장 순서를 저장할 Map
        Map<Integer, Integer> firstAppearance = new HashMap<>();
        // 빈도수를 저장할 Map
        Map<Integer, Integer> frequency = new HashMap<>();

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int C = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(stringTokenizer.nextToken());
            if (!firstAppearance.containsKey(num)) {
                firstAppearance.put(num, i);
            }
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(frequency.keySet());
        Collections.sort(list, (a, b) -> {
            int freqCompare = frequency.get(b).compareTo(frequency.get(a));
            if(freqCompare != 0) return freqCompare;
            return firstAppearance.get(a).compareTo(firstAppearance.get(b));
        });

        for(int key : list) {
            for(int i = 0; i < frequency.get(key); i++) {
                stringBuilder.append(key).append(" ");
            }
        }
        System.out.println(stringBuilder);
    }
}