import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    int height = (H - 1) / (N + 1) + 1;
    int width = (W - 1) / (M + 1) + 1;

    System.out.print(height * width);
  }
}