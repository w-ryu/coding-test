package org.cian.exam.coding.baekjoon.level.foundation1.dynamic1_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [1, 2, 3 더하기 3] 295024KB / 760ms / 932B / 완
 * DP
 * Bottom-up으로 구현
 * 기존 1,2,3 더하기 응용
 */
public class Baek15988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N+1];
        numArr[0] = 1;
        numArr[1] = 3;

        for(int i = 2 ; i <= N ; i++) {
            numArr[i] = (2 * numArr[i-1] + numArr[i-2]) % 9901;
        }

        System.out.println(numArr[N]);
    }
}
