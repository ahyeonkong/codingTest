import java.util.*;

public class Main {
    static class Point {
        int x, y;
        Point(int x, int y) { this.x = x; this.y = y; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Point current = queue.poll();
            int currentValue = board[current.x][current.y];

            if (currentValue == -1) {
                System.out.println("HaruHaru");
                return;
            }

            if (currentValue == 0) continue;

            int nx = current.x;
            int ny = current.y + currentValue;
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]) {
                visited[nx][ny] = true;
                queue.add(new Point(nx, ny));
            }

            nx = current.x + currentValue;
            ny = current.y;
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]) {
                visited[nx][ny] = true;
                queue.add(new Point(nx, ny));
            }
        }

        System.out.println("Hing");
    }
}