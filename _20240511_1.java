// 카운트 다운(https://school.programmers.co.kr/learn/courses/30/lessons/181899?language=java)
package _20240511_1;

class Solution {
    public int[] solution(int start, int end_num) {

        int[] answer = new int[(start - end_num) + 1];
        int j = 0;

        for (int i = start; i >= end_num; i--) {
            answer[j++] = i;
        }

        return answer;
    }
}
