// 접미사 배열(https://school.programmers.co.kr/learn/courses/30/lessons/181909)
package _20240507_1;
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] answer = new String[len];

        for (int i = 0; i < len; i++) {
            answer[i] = my_string.substring(i,len);
        }

        Arrays.sort(answer);

        return answer;
    }
}
