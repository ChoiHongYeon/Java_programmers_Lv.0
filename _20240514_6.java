// 홀수 vs 짝수 (https://school.programmers.co.kr/learn/courses/30/lessons/181887)
package _20240514_6;

class Solution {
    public int solution(int[] num_list) {

        int odd = 0, even = 0;
        for (int i = 0; i < num_list.length; i++) {
            switch (i % 2) {
                case 0:
                    even += num_list[i];
                    break;
                default:
                    odd += num_list[i];
            }
        }

        return Math.max(odd, even);
    }
}

public class _20240514_6 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int result1 = s.solution(new int[] {4,2,6,1,7,6});
        int result2 = s.solution(new int[] {-1,2,5,6,3});

        System.out.println(result1 + " " + result2);
    }
}
