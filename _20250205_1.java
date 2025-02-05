// 다음에 올 숫자 (https://school.programmers.co.kr/learn/courses/30/lessons/120924?language=java)
package _20250205_1;

class Solution {
    public int solution(int[] common) {

        if (common.length == 2)
            return common[0] + common[1];
        else if (common[1] - common[0] == common[2] - common[1])
            return common[common.length - 1] + common[1] - common[0];
        else
            return common[common.length - 1] * common[1] / common[0];

    }
}

public class _20250205_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution(new int[] {1, 2, 3, 4}));
        System.out.println(s.solution(new int[] {2, 4, 8}));

    }
}