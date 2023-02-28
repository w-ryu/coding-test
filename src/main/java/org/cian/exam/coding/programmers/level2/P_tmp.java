package org.cian.exam.coding.programmers.level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * 테이블 해시 다시 풀기
 *
 *
 */
public class P_tmp {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;

        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[col-1] == o2[col-1]){
                    return o2[0]-o1[0];
                }else {
                    return o1[col-1] - o2[col-1];
                }
            }
        });

        for(int i = row_begin - 1 ; i <= row_end - 1 ; i++) {
            int S_i = 0;
            for(int j = 0 ; j < data[i].length ; j++) {
                S_i += data[i][j] % (i+1);
            }
            answer ^= S_i;
        }

        return answer;
    }
}