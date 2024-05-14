// 왼쪽 오른쪽(https://school.programmers.co.kr/learn/courses/30/lessons/181890)
package _20240514_3;

class Solution {
    public String[] solution(String[] str_list) {

        int answer_len = 0, front_back = 0;
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                answer_len = i;
                front_back = 0;
                break;
            } else if (str_list[i].equals("r")) {
                answer_len = str_list.length - i - 1;
                front_back = 1;
                break;
            }
        }

        String[] answer = new String[answer_len];
        int j = 0;
        if (answer_len != 0) {
            if (front_back == 0) {
                for (int i = 0; i < answer_len; i++) {
                    answer[i] = str_list[i];
                }
            } else {
                for (int i = str_list.length - answer_len; i < str_list.length; i++) {
                    answer[j++] = str_list[i];
                }
            }
        }

        return answer;
    }
}

public class _20240514_3 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] str1 = {"u","u","l","r"};
        String[] str2 = {"l"};
        String[] result1 = s.solution(str1);
        String[] result2 = s.solution(str2);

        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }
    }
}
