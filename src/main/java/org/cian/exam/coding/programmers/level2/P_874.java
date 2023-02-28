package org.cian.exam.coding.programmers.level2;

import java.util.HashSet;
import java.util.Set;

/**
 * 124 좌표 [완]
 *
 *
 */
public class P_874 {
    public int solution(int n) {
        int[] noArr = new int[n+1];
        noArr[0] = noArr[1] = 1;

        for(int i = 2 ; i <= n ; i++) {
            noArr[i] = (noArr[i-1] + noArr[i-2]) % 1000000007;
            System.out.println(noArr[i]);
        }

        return noArr[n];
    }
}