import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int n = 0;
    int m = 0;
    
    for(int i = 1; i <= T; i++){
      n = sc.nextInt();
      m = sc.nextInt();
      System.out.println("Case "+ i + ": " + (n+m));
    }
  }
}