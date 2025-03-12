class Solution {
    public int solution(int[][] dots) {
        if (isParallel(dots[0], dots[1], dots[2], dots[3]) ||
            isParallel(dots[0], dots[2], dots[1], dots[3]) ||
            isParallel(dots[0], dots[3], dots[1], dots[2])) {
            return 1;
        }
        return 0;
        
        /*
            0번과 1번, 2번과 3번
            0번과 2번, 1번과 3번
            0번과 3번, 1번과 2번
            기울기 (y2-y1) / (x2-x1) 하나라도 겹치면 1
        */
    }
    private boolean isParallel(int[] p1, int[] p2, int[] p3, int[] p4) {
        // 기울기 비교 (분수 비교를 위한 교차곱 사용)
        int slope1 = (p2[1] - p1[1]) * (p4[0] - p3[0]);
        int slope2 = (p4[1] - p3[1]) * (p2[0] - p1[0]);

        return slope1 == slope2;
    }
}