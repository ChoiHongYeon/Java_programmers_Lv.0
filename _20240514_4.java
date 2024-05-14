// n 번째 원소까지(https://school.programmers.co.kr/learn/courses/30/lessons/181889)
package _20240514_4;
import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {

        return Arrays.copyOfRange(num_list, 0, n);

    }
}

public class _20240514_4 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result1 = s.solution(new int[] {2,1,6}, 1);
        int[] result2 = s.solution(new int[] {5,2,1,7,5}, 3);

        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");

        }
    }
}
