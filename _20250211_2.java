// 주사위의 개수 (https://school.programmers.co.kr/learn/courses/30/lessons/120845?language=java)
package _20250211_2;

class Solution {
    public int solution(int[] box, int n) {

        return (int)(box[0] / n) * (int)(box[1] / n) * (int)(box[2] / n);

    }
}

public class _20250211_2 {
    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution(new int[] {1, 1, 1}, 1));
        System.out.println(s.solution(new int[] {10, 8, 6}, 3));

    }
}