//문자열의 앞의 n글자(https://school.programmers.co.kr/learn/courses/30/lessons/181907?language=java)
package _20240508_1;
import java.lang.String;

class Solution {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(0,n);
        return answer;
    }
}