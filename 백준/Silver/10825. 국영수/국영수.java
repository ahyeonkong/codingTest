import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();
            list.add(new Student(name, korean, english, math));
        }

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s.name);
        }
    }

    static class Student implements Comparable<Student> {
        String name;
        int korean, english, math;

        Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(Student other) {
            if (this.korean != other.korean) {
                return other.korean - this.korean; // 국어 내림차순
            } else if (this.english != other.english) {
                return this.english - other.english; // 영어 오름차순
            } else if (this.math != other.math) {
                return other.math - this.math; // 수학 내림차순
            } else {
                return this.name.compareTo(other.name); // 이름 오름차순
            }
        }
    }
}
