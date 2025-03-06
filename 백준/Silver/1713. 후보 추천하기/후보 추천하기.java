import java.util.*;

class Candidate {
    int id;
    int recommendCount;
    int timeStamp;

    public Candidate(int id, int timeStamp) {
        this.id = id;
        this.recommendCount = 1;
        this.timeStamp = timeStamp;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int recommendCount = sc.nextInt();
        ArrayList<Candidate> frame = new ArrayList<>();  // 사진틀을 표현하는 ArrayList

        for (int i = 0; i < recommendCount; i++) {
            int studentId = sc.nextInt();
            boolean found = false;

            for (Candidate c : frame) {
                if (c.id == studentId) {
                    c.recommendCount++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                if (frame.size() < N) {
                    frame.add(new Candidate(studentId, i));
                } else {
                    int minRecommend = Integer.MAX_VALUE;
                    int oldestTimeStamp = Integer.MAX_VALUE;
                    int removeIndex = 0;

                    for (int j = 0; j < frame.size(); j++) {
                        Candidate c = frame.get(j);
                        if (c.recommendCount < minRecommend ||
                                (c.recommendCount == minRecommend && c.timeStamp < oldestTimeStamp)) {
                            minRecommend = c.recommendCount;
                            oldestTimeStamp = c.timeStamp;
                            removeIndex = j;
                        }
                    }

                    frame.remove(removeIndex);
                    frame.add(new Candidate(studentId, i));
                }
            }
        }

        frame.sort((a, b) -> a.id - b.id);
        for (Candidate c : frame) {
            System.out.print(c.id + " ");
        }
    }
}