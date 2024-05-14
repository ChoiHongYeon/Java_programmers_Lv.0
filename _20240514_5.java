// n개 간격의 원소들(https://school.programmers.co.kr/learn/courses/30/lessons/181888)
package _20240514_5;

class Solution {
    public int[] solution(int[] num_list, int n) {

        double answer_len = Math.ceil((double) num_list.length / n);
        int[] answer = new int[(int) answer_len];
        int i = 0;
        for (int j = 0; j < num_list.length; j += n) {
            answer[i++] = num_list[j];
        }
        
        return answer;
    }
}

public class _20240514_5 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result1 = s.solution(new int[] {4,2,6,1,7,6}, 2);
        int[] result2 = s.solution(new int[] {4,2,6,1,7,6}, 4);

        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");

        }
    }
}
