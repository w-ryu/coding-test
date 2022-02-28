package org.cian.exam.coding.programmers.level2;

import java.util.Arrays;

/**
 * 카펫 [완]
 * 완전탐색 - 방정식으로 구현
 * 카펫 가로 x, 세로 y 의 x+y , xy 방정식으로 구현
 */
public class P_42842 {
    public int[] solution(int brown, int yellow) {
        int a = (brown-4) / 2;
        int[] answer = {};
        for(int i = 1 ; i < brown/2 ; i++) {
            int b = (int)Math.pow(i,2) - (a * i) + yellow;
            if(b == 0) {
                answer = new int[]{i+2, a-i+2};
                if(a-i+2 > i+2) {
                    answer = new int[]{a-i+2, i+2};
                }
            }
        }
        return answer;
    }
}