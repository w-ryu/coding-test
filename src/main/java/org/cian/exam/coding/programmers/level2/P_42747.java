package org.cian.exam.coding.programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * H-Index [완-다시]
 * 정렬 - 문제 이해 정확하게 다시 풀기
 */
public class P_42747 {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        int length = citations.length;

        for(int i = 0 ; i < length ; i++) {
            if(citations[i] >= length - i) {
                answer = length - i;
                break;
            }
        }

        return answer;
    }
}