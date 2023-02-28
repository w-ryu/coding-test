package org.cian.exam.coding.programmers.level2;

import java.util.HashSet;
import java.util.Set;

/**
 * 124 좌표 [완]
 *
 *
 */
public class P_466460 {
    public int solution1(int n, int a, int b) {
        int answer = 0;

        while(n / (int)Math.pow(2, answer + 1) > 0) answer++;
        while(true) {
            int _n = n/2;
            if((a <= _n && b > _n) || (a > _n && b <= _n) || (a <= 2 && b <= 2)) {
                break;
            }else {
                if(a > _n && b > _n) {
                    a -= _n;
                    b -= _n;
                }
                n = _n;
                answer--;
            }
        }

        return answer;
    }

    public int[] solution2(String s) {
        int[] answer = new int[2];
        answer[0] = answer[1] = 0;

        while(s.length() > 1){
            String _s = s.replaceAll("0", "");
            answer[1] += s.length() - _s.length();
            answer[0]++;
            s = Integer.toBinaryString(_s.length()).toString();
        }

        return answer;
    }
}