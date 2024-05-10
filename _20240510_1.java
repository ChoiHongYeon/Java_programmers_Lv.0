// 배열 만들기 1(https://school.programmers.co.kr/learn/courses/30/lessons/181901?language=java)
package _20240510_1;

class Solution {
    public int[] solution(int n, int k) {
        int s = (int)(n / k);
        int[] answer = new int[s];
        int i = 0;

        for (int j = k; j <= n; j += k) {
            answer[i++] = j;
        }

        return answer;
    }
}
