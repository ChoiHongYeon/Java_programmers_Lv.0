// 평행 (https://school.programmers.co.kr/learn/courses/30/lessons/120875?language=java)
package _20250203_1;

class Solution {
    public int solution(int[][] dots) {

        int x = 0;
        int y = 0;

        for (int i = 1; i < 4; i++) {

            x = dots[0][0];
            y = dots[0][1];
            int tmp_x = -1;
            int tmp_y = -1;

            for (int j = 1; j < 4; j++) {
                if (j == i) {
                    x -= dots[j][0];
                    y -= dots[j][1];
                } else {
                    if (tmp_x == -1) {
                        tmp_x = dots[j][0];
                        tmp_y = dots[j][1];
                    } else {
                        tmp_x -= dots[j][0];
                        tmp_y -= dots[j][1];
                    }
                }
            }

            if (x == tmp_x && y == tmp_y)
                return 1;
            if (x == tmp_x * -1 && y == tmp_y * -1)
                return 1;

        }

        return 0;

    }
}

public class _20250203_1 {
    public static void main(String[] args) {

        Solution s = new Solution();

        int[][] dots1 = new int[][] {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int[][] dots2 = new int[][] {{3, 5}, {4, 1}, {2, 4}, {5, 10}};

        System.out.println(s.solution(dots1) + " " + s.solution(dots2));

    }
}
