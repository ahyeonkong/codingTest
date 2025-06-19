import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    String[] arr = new String[N];

    for(int i = 0; i < N; i++){
      arr[i] = sc.nextLine();
    }

    for(int i = 0; i < N; i++){
      System.out.println(arr[i].toLowerCase());
    }
  }
}