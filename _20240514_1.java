// n 번째 원소부터(https://school.programmers.co.kr/learn/courses/30/lessons/181892)
package _20240514_1;

class Solution {
    public int[] solution(int[] num_list, int n) {

        int i = 0;
        int[] answer = new int[num_list.length - n + 1];

        for (int j = n - 1; j < num_list.length; j++) {
            answer[i++] = num_list[j];
        }

        return answer;
    }
}

public class _20240514_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] result1 = s.solution(new int[] {2,1,6}, 3);
        int[] result2 = s.solution(new int[] {5,2,1,7,5}, 2);

        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");

        }
    }
}
