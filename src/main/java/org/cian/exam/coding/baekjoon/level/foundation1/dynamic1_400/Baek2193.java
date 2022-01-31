package org.cian.exam.coding.baekjoon.level.foundation1.dynamic1_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [이친수] 14188KB / 120ms / 544B
 */
public class Baek2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] numArr = new long[N+1];

        numArr[0] = 0;
        numArr[1] = 1;

        for(int i = 2 ; i <= N ; i++) {
            numArr[i] = numArr[i-1] + numArr[i-2];
        }

        System.out.println(numArr[N]);
    }
}
