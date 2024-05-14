// 5명씩 (https://school.programmers.co.kr/learn/courses/30/lessons/181886)
package _20240514_7;

class Solution {
    public String[] solution(String[] names) {

        double answer_len = Math.ceil((names.length * 1.0) / 5.0);
        String[] answer = new String[(int) answer_len];

        for (int i = 0; i < answer_len; i++) {
            answer[i] = names[5 * i];
        }

        return answer;
    }
}

public class _20240514_7 {
    public static void main(String[] args) {

        Solution s = new Solution();
        String[] result = s.solution(new String[] {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"});

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
