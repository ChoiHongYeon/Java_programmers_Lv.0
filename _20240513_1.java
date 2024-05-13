// 배열 조각하기(https://school.programmers.co.kr/learn/courses/30/lessons/181893?language=java)
package _20240513_1;

class Solution {
    public int[] solution(int[] arr, int[] query) {

        int answer_len = arr.length;
        int start_num = 0;
        int i = 0;

        for (int j = 0; j < query.length; j++) {
            if (j % 2 == 0)
                answer_len = query[j] + 1;
            else {
                answer_len -= query[j];
                start_num += query[j];
            }
        }

        int[] answer = new int[answer_len];
        for (int j = start_num; j < start_num + answer_len; j++) {
            answer[i++] = arr[j];
        }

        return answer;
    }
}

public class _20240513_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] result = s.solution(new int[] {0,1,2,3,4,5}, new int[] {4,1,2});

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}