import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        for(int i = 0; i < N; i++){
            String line = bufferedReader.readLine();
            if(line.length() >= M)
                hashMap.put(line, hashMap.getOrDefault(line, 0) + 1);
        }

        List<String> list = new ArrayList<>(hashMap.keySet());

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 자주 등장하는 단어 순서대로 정렬
                if (Integer.compare(hashMap.get(o1), hashMap.get(o2)) != 0) {
                    // 내림차순 정렬
                    return Integer.compare(hashMap.get(o2), hashMap.get(o1));
                }
                // 등장 횟수가 동일한 경우, 문자열의 길이를 비교
                if (o1.length() != o2.length()) {
                    // 긴 문자열이 앞쪽에 위치
                    return o2.length() - o1.length();
                }
                // 등장 횟수와 길이가 같으면 사전 순으로 정렬
                return o1.compareTo(o2);
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for (String str : list) {
            stringBuilder.append(str + "\n");
        }

        System.out.println(stringBuilder);
    }
}