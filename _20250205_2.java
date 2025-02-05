// 다항식 더하기 (https://school.programmers.co.kr/learn/courses/30/lessons/120863?language=java)
package _20250205_2;

class Solution {
    public String solution(String polynomial) {

        polynomial = polynomial.replace(" ", "");
        String[] p = polynomial.split("\\+");
        int x = 0;
        int y = 0;

        for (int i = 0; i < p.length; i++) {
            if (p[i].endsWith("x")) {
                if (p[i].length() == 1)
                    x++;
                else
                    x += Integer.parseInt(p[i].replace("x", ""));
            }
            else
                y += Integer.parseInt(p[i]);
        }

        String answer = "";
        if (x == 1)
            answer = "x";
        else if (x > 1)
            answer = Integer.toString(x).concat("x");
        if (y > 0) {
            if (answer.equals(""))
                answer = Integer.toString(y);
            else
                answer = answer.concat(" + ").concat(Integer.toString(y));
        }

        return answer;

    }
}

public class _20250205_2 {
    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution("3x + 7 + x"));
        System.out.println(s.solution("x + x + x"));

    }
}