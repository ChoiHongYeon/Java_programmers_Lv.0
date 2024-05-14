// 순서 바꾸기(https://school.programmers.co.kr/learn/courses/30/lessons/181891)
package _20240514_2;

class Solution {
    public int[] solution(int[] num_list, int n) {

        int i = 0;
        int[] answer = new int[num_list.length];

        for (int j = n; j < num_list.length; j++) {
            answer[i++] = num_list[j];
        }
        for (int j = 0; j < n; j++) {
            answer[i++] = num_list[j];
        }

        return answer;
    }
}

public class _20240514_2 {
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
