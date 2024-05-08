// 접두사인지 확인하기(https://school.programmers.co.kr/learn/courses/30/lessons/181906)
package _20240508_2;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 1;
        int my_len = my_string.length();
        int is_len = is_prefix.length();

        if (is_len > my_len) answer = 0;
        else if (!my_string.substring(0,is_len).equals(is_prefix)) answer = 0;

        return answer;
    }
}
