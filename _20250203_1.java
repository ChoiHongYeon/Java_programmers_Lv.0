// 평행 (https://school.programmers.co.kr/learn/courses/30/lessons/120875?language=java)
package _20250203_1;

class Solution {
    public int solution(int[][] dots) {

        if ((dots[0][0] - dots[1][0]) * (dots[2][1] - dots[3][1]) == (dots[0][1] - dots[1][1]) * (dots[2][0] - dots[3][0]))
            return 1;
        if ((dots[0][0] - dots[2][0]) * (dots[1][1] - dots[3][1]) == (dots[0][1] - dots[2][1]) * (dots[1][0] - dots[3][0]))
            return 1;
        if ((dots[0][0] - dots[3][0]) * (dots[1][1] - dots[2][1]) == (dots[0][1] - dots[3][1]) * (dots[1][0] - dots[2][0]))
            return 1;

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