// 외계어 사전 (https://school.programmers.co.kr/learn/courses/30/lessons/120869?language=java)
package _20250216_1;

class Solution {
    public int solution(String[] spell, String[] dic) {

        int kinds[] = new int[dic.length];
        for (int i = 0; i < dic.length; i++) {
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j]))
                    kinds[i]++;
            }
        }

        for (int i = 0; i < dic.length; i++) {
            if (dic[i].length() == spell.length && kinds[i] == spell.length)
                return 1;
        }
        return 2;

    }
}

public class _20250216_1 {
    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solution(new String[] {"p", "o", "s"}, new String[] {"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(s.solution(new String[] {"z", "d", "x"}, new String[] {"def", "dww", "dzx", "loveaw"}));
        System.out.println(s.solution(new String[] {"s", "o", "m", "d"}, new String[] {"moos", "dzx", "smm", "sunmmo", "som"}));

    }
}