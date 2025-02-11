// 배열 회전시키기 (https://school.programmers.co.kr/learn/courses/30/lessons/120844?language=java)
package _20250211_1;

class Solution {
    public int[] solution(int[] numbers, String direction) {

        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i + 1] = numbers[i];
            }
            answer[0] = numbers[numbers.length - 1];
        } else {
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[answer.length - 1] = numbers[0];
        }

        return answer;

    }
}

public class _20250211_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] result1 = s.solution(new int[] {1, 2, 3}, "right");
        int[] result2 = s.solution(new int[] {4, 455, 6, 4, -1, 45, 6}, "left");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }

    }
}