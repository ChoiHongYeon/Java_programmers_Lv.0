// 리스트 자르기(https://school.programmers.co.kr/learn/courses/30/lessons/181897)
package _20240511_3;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {

        int a = 0, b = 0, c = 1;
        switch (n) {
            case 1:
                b = slicer[1];
                break;
            case 2:
                a = slicer[0];
                b = num_list.length - 1;
                break;
            case 3:
                a = slicer[0];
                b = slicer[1];
                break;
            default:
                a = slicer[0];
                b = slicer[1];
                c = slicer[2];
        }

        int answer_len = 0;
        for (int j = a; j <= b; j += c) {
            answer_len++;
        }
        int[] answer = new int[answer_len];

        int i = 0;

        for (int j = a; j <= b; j += c) {
            answer[i++] = num_list[j];
        }

        return answer;
    }
}
