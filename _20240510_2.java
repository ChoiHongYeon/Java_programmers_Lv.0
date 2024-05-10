// 글자 지우기(https://school.programmers.co.kr/learn/courses/30/lessons/181900)
package _20240510_2;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int c = 0;

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < indices.length; j++) {
                if (i == indices[j]) c++;
            }
            if (c == 0) answer += my_string.charAt(i);
            c = 0;
        }

        return answer;
    }
}
