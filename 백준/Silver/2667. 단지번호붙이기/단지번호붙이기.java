// dx, dy, map, visited 구현 후 BFS 함수 구현

import java.util.*;
import java.awt.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] map;
    static boolean[][] visited;
    static int N;

    public static void main(String[] args) {
        // 값 입력 받기
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++){
            String line = scanner.next();
            for(int j = 0; j < N; j++){
                map [i][j] = line.charAt(j) - '0';
            }
        }

        // 각 단지에 속한 집의 수를 저장할 리스트
        ArrayList<Integer> complexSizes = new ArrayList<>();

        // 전체 지도를 순회하며 단지 찾기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 만약 현재 위치에 집이 있고(1) 아직 방문하지 않았다면 새로운 단지의 시작점
                if (map[i][j] == 1 && !visited[i][j]) {
                    // BFS를 실행하여 연결된 모든 집을 찾고, 그 개수를 리스트에 추가
                    int size = BFS(i, j);
                    complexSizes.add(size);
                }
            }
        }

        // 총 단지 수 출력
        System.out.println(complexSizes.size());

        // 각 단지 내 집의 수를 오름차순으로 정렬
        Collections.sort(complexSizes);

        // 정렬된 결과를 순서대로 출력
        for (int size : complexSizes) {
            System.out.println(size);
        }
        scanner.close();
    }
    static int BFS(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        // 방문한 위치는 true
        visited[x][y] = true;

        int houseCount = 1; // 단지 내 집의 수 (시작점 포함 1로 시작)

        // 큐에서 현재 위치를 Point 객체로 꺼냄
        while(!queue.isEmpty()){
            Point current = queue.poll();

            for(int i = 0; i < 4; i++){
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                // 위치 범위 유효성 검사
                if(nx < 0 || ny < 0 || nx >= N || ny >= N)
                    continue;
                if(visited[nx][ny] == true || map[nx][ny] == 0)
                    continue;
                // 가보지 않은 새로운 길 발견
                queue.add(new Point(nx, ny));
                // 큐에 넣자마자 바로 visited 바꿔야 함
                visited[nx][ny] = true;
                houseCount++; // 단지 내 집의 수 증가
            }
        }
        return houseCount;
    }
}
