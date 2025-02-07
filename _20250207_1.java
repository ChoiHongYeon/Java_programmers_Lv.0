// 피자 나눠 먹기 (2) (https://school.programmers.co.kr/learn/courses/30/lessons/120815?language=java)
package _20250207_1;

class Solution {
    public int solution(int n) {

        for (int i = 1; i <= 100; i++) {
            if ((6 * i) % n == 0)
                return i;
        }
        return 0;

    }
}

public class _20250207_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution(6));
        System.out.println(s.solution(10));
        System.out.println(s.solution(4));

    }
}