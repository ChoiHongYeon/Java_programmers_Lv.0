// 합성수 찾기 (https://school.programmers.co.kr/learn/courses/30/lessons/120846?language=java)
package _20250211_3;
import java.util.*;

class Solution {
    public int solution(int n) {

        if (n == 1)
            return 0;

        int numbers[] = new int[n];
        Arrays.fill(numbers, 1);
        for (int i = 1; i < numbers.length; i++) {
            numbers[i]++;
            if (numbers[i] == 2) {
                for (int j = i; j < numbers.length; j += (i + 1)) {
                    if (j != i)
                        numbers[j]++;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 3)
                answer++;
        }

        return answer;

    }
}

public class _20250211_3 {
    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution(10));
        System.out.println(s.solution(15));

    }
}