// 옷가게 할인 받기 (https://school.programmers.co.kr/learn/courses/30/lessons/120818?language=java)
package _20250207_2;

class Solution {
    public int solution(int price) {

        double p = price;
        if (p >= 500000)
            p *= 0.8;
        else if (p >= 300000)
            p *= 0.9;
        else if (p >= 100000)
            p *= 0.95;
        return (int)p;

    }
}

public class _20250207_2 {
    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution(150000));
        System.out.println(s.solution(580000));

    }
}